package com.google.chat.smartmessaging.smartreply.android;

import defpackage.cgmb;
import defpackage.emhv;
import defpackage.emko;
import defpackage.emlq;
import defpackage.emms;
import defpackage.empf;
import defpackage.enru;
import defpackage.fbts;
import defpackage.fbun;
import defpackage.fbup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SensitiveClassifierJni implements empf {
    public static final enru a = enru.c("com/google/chat/smartmessaging/smartreply/android/SensitiveClassifierJni");
    private final int b;
    private long modelPtr;

    public SensitiveClassifierJni(emko emkoVar, cgmb cgmbVar) {
        this.modelPtr = 0L;
        this.b = emkoVar.e;
        String a2 = cgmbVar.a();
        if (a2.isEmpty()) {
            throw new emlq("Cannot read the SensitiveClassifier File: ".concat(emms.b(emkoVar.c == 2 ? (emhv) emkoVar.d : emhv.a)));
        }
        this.modelPtr = loadModel(a2);
    }

    private final synchronized void b() {
        internalClose();
        this.modelPtr = 0L;
    }

    private native void internalClose();

    private native boolean isSensitive(ArrayList<String> arrayList);

    private native long loadModel(String str);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.empf
    public final Set a(fbts fbtsVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        fbup fbupVar = fbtsVar.f;
        if (fbupVar == null) {
            fbupVar = fbup.a;
        }
        int size = fbupVar.b.size();
        for (int i = 0; i < size && i < this.b; i++) {
            fbup fbupVar2 = fbtsVar.f;
            if (fbupVar2 == null) {
                fbupVar2 = fbup.a;
            }
            fbun fbunVar = (fbun) fbupVar2.b.get((size - 1) - i);
            arrayList.add(fbunVar.b == 30 ? (String) fbunVar.c : "");
        }
        HashSet hashSet = new HashSet();
        if (isSensitive(arrayList)) {
            hashSet.add("SENSITIVE");
        }
        return hashSet;
    }

    protected final void finalize() {
        b();
    }
}
