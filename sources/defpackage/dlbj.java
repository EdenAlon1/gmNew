package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbj extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ PersephoneDownloadWorker c;
    final /* synthetic */ dlbx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlbj(PersephoneDownloadWorker persephoneDownloadWorker, dlbx dlbxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = persephoneDownloadWorker;
        this.d = dlbxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlbj) c((ewev) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ewev ewevVar = (ewev) this.b;
        PersephoneDownloadWorker persephoneDownloadWorker = this.c;
        dlbx dlbxVar = this.d;
        byte[] bArr = dlbxVar.b;
        eyee eyeeVar = dlbxVar.c;
        boolean z = dlbxVar.d;
        String str = dlbxVar.e;
        ewevVar.getClass();
        dlbx dlbxVar2 = new dlbx(ewevVar, bArr);
        this.a = 1;
        Object l = persephoneDownloadWorker.l(dlbxVar2, this);
        return l == ffhhVar ? ffhhVar : l;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dlbj dlbjVar = new dlbj(this.c, this.d, ffguVar);
        dlbjVar.b = obj;
        return dlbjVar;
    }
}
