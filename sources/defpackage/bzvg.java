package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzvg extends caes {
    public final ChatMessage a;
    private final fays b;
    private final Optional c;

    public bzvg(fays faysVar, ChatMessage chatMessage, Optional optional) {
        this.b = faysVar;
        this.a = chatMessage;
        this.c = optional;
    }

    @Override // defpackage.caes
    public final ChatMessage a() {
        return this.a;
    }

    @Override // defpackage.caes
    public final fays b() {
        return this.b;
    }

    @Override // defpackage.caes
    public final Optional c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof caes) {
            caes caesVar = (caes) obj;
            fays faysVar = this.b;
            if (faysVar != null ? faysVar.equals(caesVar.b()) : caesVar.b() == null) {
                ChatMessage chatMessage = this.a;
                if (chatMessage != null ? chatMessage.equals(caesVar.a()) : caesVar.a() == null) {
                    if (this.c.equals(caesVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        fays faysVar = this.b;
        int hashCode = faysVar == null ? 0 : faysVar.hashCode();
        ChatMessage chatMessage = this.a;
        return ((((hashCode ^ 1000003) * 1000003) ^ (chatMessage != null ? chatMessage.hashCode() : 0)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        ChatMessage chatMessage = this.a;
        return "SecretMessageAndReceipt{decryptedSecretMessage=" + String.valueOf(this.b) + ", receiptToSend=" + String.valueOf(chatMessage) + ", reasonForAborting=" + optional.toString() + "}";
    }
}
