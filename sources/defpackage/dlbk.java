package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbk extends ffhr {
    public /* synthetic */ Object a;
    final /* synthetic */ PersephoneDownloadWorker b;
    public int c;
    public PersephoneDownloadWorker d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlbk(PersephoneDownloadWorker persephoneDownloadWorker, ffgu ffguVar) {
        super(ffguVar);
        this.b = persephoneDownloadWorker;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(null, this);
    }
}
