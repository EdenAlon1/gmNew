package com.google.mediapipe.framework;

import defpackage.exlp;
import defpackage.exlr;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ProtoUtil {
    static final exlr a = new exlr();
    public static final /* synthetic */ int b = 0;

    /* compiled from: PG */
    public static class SerializedMessage {
        public String typeName;
        public byte[] value;
    }

    public static String a(Class cls) {
        return (String) a.a.get(cls);
    }

    public static void b(Class cls, String str) {
        exlr exlrVar = a;
        if (!exlrVar.a.containsKey(cls) || ((String) exlrVar.a.get(cls)).equals(str)) {
            exlrVar.a.put(cls, str);
            return;
        }
        throw new MediaPipeException(exlp.ALREADY_EXISTS.ordinal(), "Protobuf type name: " + str + " conflicts with: " + ((String) exlrVar.a.get(cls)));
    }
}
