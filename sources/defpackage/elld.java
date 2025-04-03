package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elld {
    private final Context a;
    private final ellq b;
    private final emxc c;

    public elld(ea eaVar, ellq ellqVar, emxc emxcVar) {
        this.a = eaVar.z();
        this.b = ellqVar;
        this.c = emxcVar;
    }

    public final ellc a() {
        return new ellc(this.a, this.b, this.c);
    }
}
