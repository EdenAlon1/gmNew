package com.google.chat.smartmessaging.smartreply.android;

import defpackage.emiw;
import defpackage.fbts;
import defpackage.fbun;
import defpackage.fbup;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class LanguageDetectorJni {
    private long langIdPtr;

    public LanguageDetectorJni() {
        this.langIdPtr = 0L;
        try {
            this.langIdPtr = loadModel();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private final synchronized void b() {
        if (this.langIdPtr != 0) {
            internalClose();
        }
        this.langIdPtr = 0L;
    }

    private native String detectLanguage(String str, float f);

    private native void internalClose();

    private native long loadModel();

    public final synchronized Locale a(fbts fbtsVar, emiw emiwVar) {
        if (this.langIdPtr == 0) {
            return Locale.forLanguageTag(fbtsVar.j);
        }
        StringBuffer stringBuffer = new StringBuffer();
        fbup fbupVar = fbtsVar.f;
        if (fbupVar == null) {
            fbupVar = fbup.a;
        }
        for (fbun fbunVar : fbupVar.b) {
            String str = fbunVar.b == 30 ? (String) fbunVar.c : "";
            if (stringBuffer.length() != 0 && !str.isEmpty()) {
                stringBuffer.append(" ");
            }
            if (!str.isEmpty()) {
                stringBuffer.append(str);
            }
        }
        String detectLanguage = detectLanguage(stringBuffer.toString(), emiwVar.c);
        if (detectLanguage == null) {
            detectLanguage = fbtsVar.j;
        }
        return Locale.forLanguageTag(detectLanguage);
    }

    protected final void finalize() {
        b();
    }
}
