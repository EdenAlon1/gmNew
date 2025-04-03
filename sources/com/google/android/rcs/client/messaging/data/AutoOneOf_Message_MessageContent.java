package com.google.android.rcs.client.messaging.data;

import com.google.android.rcs.client.messaging.data.Message;
import defpackage.eigl;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoOneOf_Message_MessageContent {

    /* compiled from: PG */
    private static final class Impl_basicTextMessage extends Parent_ {
        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final eigl a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: PG */
    private static final class Impl_chat extends Parent_ {
        private final ChatMessage a;

        public Impl_chat(ChatMessage chatMessage) {
            this.a = chatMessage;
        }

        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final eigl a() {
            return eigl.CHAT;
        }

        @Override // com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent.Parent_, com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final ChatMessage b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Message.MessageContent) {
                Message.MessageContent messageContent = (Message.MessageContent) obj;
                if (eigl.CHAT == messageContent.a() && this.a.equals(messageContent.b())) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MessageContent{chat=" + this.a.toString() + "}";
        }
    }

    /* compiled from: PG */
    private static final class Impl_fileTransferInformation extends Parent_ {
        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final eigl a() {
            throw null;
        }

        @Override // com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent.Parent_, com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final FileTransferInformation c() {
            throw null;
        }

        public final boolean equals(Object obj) {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: PG */
    public static final class Impl_isComposing extends Parent_ {
        private final IsComposingMessage a;

        public Impl_isComposing(IsComposingMessage isComposingMessage) {
            this.a = isComposingMessage;
        }

        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final eigl a() {
            return eigl.IS_COMPOSING;
        }

        @Override // com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent.Parent_, com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final IsComposingMessage d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Message.MessageContent) {
                Message.MessageContent messageContent = (Message.MessageContent) obj;
                if (eigl.IS_COMPOSING == messageContent.a() && this.a.equals(messageContent.d())) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MessageContent{isComposing=" + this.a.toString() + "}";
        }
    }

    /* compiled from: PG */
    private static final class Impl_locationInformation extends Parent_ {
        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final eigl a() {
            throw null;
        }

        @Override // com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent.Parent_, com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final LocationInformation e() {
            throw null;
        }

        public final boolean equals(Object obj) {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: PG */
    private static final class Impl_messageReceipt extends Parent_ {
        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final eigl a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            throw null;
        }

        @Override // com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent.Parent_, com.google.android.rcs.client.messaging.data.Message.MessageContent
        public final MessageReceipt f() {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: PG */
    private static abstract class Parent_ extends Message.MessageContent {
        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public ChatMessage b() {
            throw new UnsupportedOperationException(a().toString());
        }

        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public FileTransferInformation c() {
            throw new UnsupportedOperationException(a().toString());
        }

        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public IsComposingMessage d() {
            throw new UnsupportedOperationException(a().toString());
        }

        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public LocationInformation e() {
            throw new UnsupportedOperationException(a().toString());
        }

        @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
        public MessageReceipt f() {
            throw new UnsupportedOperationException(a().toString());
        }
    }

    public static Message.MessageContent a(ChatMessage chatMessage) {
        chatMessage.getClass();
        return new Impl_chat(chatMessage);
    }
}
