package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdx extends ffkk implements ffix {
    final /* synthetic */ boolean a;
    final /* synthetic */ owv b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdx(boolean z, owv owvVar, String str) {
        super(0);
        this.a = z;
        this.b = owvVar;
        this.c = str;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.a) {
            owv owvVar = this.b;
            String str = this.c;
            oxc oxcVar = owvVar.a;
            synchronized (oxcVar.b) {
            }
        }
        return ffcu.a;
    }
}
