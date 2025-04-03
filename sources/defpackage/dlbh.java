package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbh extends ffhr {
    public Object a;
    public /* synthetic */ Object b;
    final /* synthetic */ PersephoneDownloadWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlbh(PersephoneDownloadWorker persephoneDownloadWorker, ffgu ffguVar) {
        super(ffguVar);
        this.c = persephoneDownloadWorker;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(null, this);
    }
}
