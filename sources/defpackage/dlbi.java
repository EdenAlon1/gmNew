package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbi extends ffhr {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public long f;
    public boolean g;
    public boolean h;
    public /* synthetic */ Object i;
    final /* synthetic */ PersephoneDownloadWorker j;
    public int k;
    public dlbg l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlbi(PersephoneDownloadWorker persephoneDownloadWorker, ffgu ffguVar) {
        super(ffguVar);
        this.j = persephoneDownloadWorker;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
