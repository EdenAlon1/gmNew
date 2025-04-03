package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeks extends eekz {
    public eeks() {
    }

    @Override // defpackage.eeku
    public final String a() {
        eejd eejdVar = this.e;
        if (eejdVar == null || eejdVar.h()) {
            return emxe.b(this.d);
        }
        return this.d + ";" + this.e.c();
    }

    @Override // defpackage.eekz, defpackage.eeku
    public final eejd d() {
        return this.e;
    }

    public eeks(String str, String str2) {
        super(str);
        this.d = str2;
    }
}
