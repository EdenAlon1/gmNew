package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfp extends fflr {
    final /* synthetic */ kfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfp(kfq kfqVar, kgm kgmVar) {
        super(kgmVar);
        this.a = kfqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [khk] */
    @Override // defpackage.fflr
    public final /* bridge */ /* synthetic */ void a(ffmx ffmxVar, Object obj, Object obj2) {
        kho khoVar;
        kgm kgmVar = (kgm) obj2;
        String b = ffmxVar.b();
        kgmVar.getClass();
        if (kgmVar.b.b() && kgmVar.c.b()) {
            khoVar = kgmVar.a.a();
        } else {
            kho khoVar2 = new kho(new char[0]);
            kgn kgnVar = kgmVar.b;
            if (!kgnVar.b()) {
                khoVar2.r("min", kgnVar.a());
            }
            kgn kgnVar2 = kgmVar.c;
            if (!kgnVar2.b()) {
                khoVar2.r("max", kgnVar2.a());
            }
            khoVar2.r(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, kgmVar.a.a());
            khoVar = khoVar2;
        }
        this.a.b.r(b, khoVar);
    }
}
