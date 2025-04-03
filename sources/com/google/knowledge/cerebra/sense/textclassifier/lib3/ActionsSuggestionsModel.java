package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import android.content.res.AssetFileDescriptor;
import defpackage.ewvk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ActionsSuggestionsModel implements AutoCloseable {
    public long a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: PG */
    public static final class ActionSuggestion {
        public final String a;
        public final String b;
        public final float c;
        public final NamedVariant[] d;
        public final byte[] e;
        public final RemoteActionTemplate[] f;
        public final Slot[] g;

        public ActionSuggestion(String str, String str2, float f, NamedVariant[] namedVariantArr, byte[] bArr, RemoteActionTemplate[] remoteActionTemplateArr, Slot[] slotArr) {
            this.a = str;
            this.b = str2;
            this.c = f;
            this.d = namedVariantArr;
            this.e = bArr;
            this.f = remoteActionTemplateArr;
            this.g = slotArr;
        }
    }

    /* compiled from: PG */
    public static final class ActionSuggestionOptions {
    }

    /* compiled from: PG */
    public static final class ActionSuggestions {
        public final ActionSuggestion[] a;
        public final boolean b;

        public ActionSuggestions(ActionSuggestion[] actionSuggestionArr, boolean z) {
            this.a = actionSuggestionArr;
            this.b = z;
        }
    }

    /* compiled from: PG */
    public static final class Conversation {
        public final ConversationMessage[] a;

        public Conversation(ConversationMessage[] conversationMessageArr) {
            this.a = conversationMessageArr;
        }

        public ConversationMessage[] getConversationMessages() {
            return this.a;
        }
    }

    /* compiled from: PG */
    public static final class ConversationMessage {
        private final int a;
        private final String b;
        private final String c;
        private final String d;

        public ConversationMessage(int i, String str, String str2, String str3) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public String getDetectedTextLanguageTags() {
            return this.d;
        }

        public long getReferenceTimeMsUtc() {
            return 0L;
        }

        public String getReferenceTimezone() {
            return this.c;
        }

        public String getText() {
            return this.b;
        }

        public int getUserId() {
            return this.a;
        }
    }

    /* compiled from: PG */
    public static final class Slot {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final float e;

        public Slot(String str, int i, int i2, int i3, float f) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = f;
        }
    }

    static {
        ewvk.a();
    }

    public ActionsSuggestionsModel(AssetFileDescriptor assetFileDescriptor) {
        long nativeNewActionsModelWithOffset = nativeNewActionsModelWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength(), null);
        this.a = nativeNewActionsModelWithOffset;
        if (nativeNewActionsModelWithOffset == 0) {
            throw new IllegalArgumentException("Couldn't initialize actions model from file descriptor.");
        }
    }

    private native void nativeCloseActionsModel(long j);

    public static native String nativeGetLocalesWithOffset(int i, long j, long j2);

    public static native int nativeGetVersionWithOffset(int i, long j, long j2);

    private static native long nativeNewActionsModelWithOffset(int i, long j, long j2, byte[] bArr);

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b.compareAndSet(false, true)) {
            nativeCloseActionsModel(this.a);
            this.a = 0L;
        }
    }

    protected final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public native long nativeGetNativeModelPtr(long j);

    public native boolean nativeInitializeConversationIntentDetection(long j, byte[] bArr);

    public native ActionSuggestions nativeSuggestActions(long j, Conversation conversation, ActionSuggestionOptions actionSuggestionOptions, long j2, Object obj, String str, boolean z);
}
