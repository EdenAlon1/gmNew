package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vzu extends mo {
    final /* synthetic */ engw a;
    final /* synthetic */ engw b;

    public vzu(engw engwVar, engw engwVar2) {
        this.a = engwVar;
        this.b = engwVar2;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.mo
    public final int b() {
        return this.a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        if (((bcul) this.b.get(i2)).equals(bcul.SETTING_XMS_MODE)) {
            return false;
        }
        return e(i, i2);
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        return this.a.get(i) == this.b.get(i2);
    }
}
