package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyi extends ffkk implements ffji {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyi(String str) {
        super(1);
        this.a = str;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(ffkj.e((String) obj, this.a));
    }
}
