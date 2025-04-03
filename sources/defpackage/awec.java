package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class awec extends dtrr {
    public awap a;
    public awfr b;
    public Uri c;
    public awup d;
    public fayi e;
    public String f;
    public awvb g;
    public espg h;

    public awec() {
        super(awfq.e());
        this.a = null;
    }

    public final awea a() {
        aweb awebVar = new aweb();
        awebVar.aC(aB());
        awebVar.a = this.a;
        awebVar.b = this.b;
        awebVar.c = this.c;
        awebVar.d = this.d;
        awebVar.e = this.e;
        awebVar.f = this.f;
        awebVar.g = this.g;
        awebVar.h = this.h;
        awebVar.cK = aC();
        return awebVar;
    }

    public final void b(fayi fayiVar) {
        aE(4);
        this.e = fayiVar;
    }

    public final void c(awfr awfrVar) {
        aE(1);
        this.b = awfrVar;
    }

    public final void d(awap awapVar) {
        aE(0);
        this.a = awapVar;
    }

    public final void e(String str) {
        aE(5);
        this.f = str;
    }

    public final void f(awvb awvbVar) {
        aE(6);
        this.g = awvbVar;
    }
}
