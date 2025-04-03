package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfx implements ekcv {
    private volatile ekeg a;
    private enhk b;
    private boolean c;
    private ekfw d;

    public ekfx(Map map, ekeg ekegVar) {
        this.a = ekegVar;
        this.b = engq.e(map);
    }

    @Override // defpackage.ekcv
    public final ekah a(String str, ffji ffjiVar) {
        efbd.c();
        Object e = ffew.e(this.b, str);
        e.getClass();
        ekah ekahVar = (ekah) e;
        if (!this.c) {
            ffjiVar.invoke(this.a);
        }
        this.c = true;
        return ekahVar;
    }

    @Override // defpackage.ekcv
    public final ekeg b() {
        return this.a;
    }

    @Override // defpackage.ekcv
    public final void c() {
        efbd.c();
        ekfw ekfwVar = this.d;
        ekfwVar.getClass();
        this.b = ekfwVar.a;
        ekfwVar.getClass();
        this.a = ekfwVar.b;
        this.c = false;
        this.d = null;
    }

    @Override // defpackage.ekcv
    public final boolean d() {
        efbd.c();
        return this.d != null;
    }

    @Override // defpackage.ekcv
    public final boolean e(Map map, ekeg ekegVar) {
        efbd.c();
        enhk e = engq.e(map);
        if (this.c) {
            this.d = new ekfw(e, ekegVar);
            return false;
        }
        this.b = e;
        this.a = ekegVar;
        return true;
    }
}
