package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahvj extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ ahvk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvj(ahvk ahvkVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ahvkVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ahvj ahvjVar = new ahvj(this.c, (ffgu) obj3);
        ahvjVar.a = booleanValue;
        ahvjVar.b = (List) obj2;
        return ahvjVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        ?? r2 = this.b;
        ahvk ahvkVar = this.c;
        return new ahvn(z, r2, ahvkVar.e.a(), ahvkVar.d, new ahvm(((auhn) ahvkVar.b.b()).a()));
    }
}
