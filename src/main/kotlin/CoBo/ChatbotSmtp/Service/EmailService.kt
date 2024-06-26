package CoBo.ChatbotSmtp.Service

import CoBo.ChatbotSmtp.Data.Dto.Email.Req.EmailPatchVerificationCodeReq
import CoBo.ChatbotSmtp.Data.Dto.Email.Req.EmailPostVerificationCodeReq
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

interface EmailService {

    fun postVerificationCode(emailPostVerificationCodeReq: EmailPostVerificationCodeReq): ResponseEntity<HttpStatus>

    fun postVerificationCodeNot(emailPostVerificationCodeReq: EmailPostVerificationCodeReq): ResponseEntity<HttpStatus>

    fun patchVerificationCode(emailPatchVerificationCodeReq: EmailPatchVerificationCodeReq): ResponseEntity<HttpStatus>
    fun getCheck(): ResponseEntity<HttpStatus>
}