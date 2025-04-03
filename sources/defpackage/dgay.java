package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgay extends dgaw {
    final /* synthetic */ Map b;
    final /* synthetic */ dgbd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgay(dgbd dgbdVar, String str, DroidGuardResultsRequest droidGuardResultsRequest, Map map) {
        super(str, droidGuardResultsRequest);
        this.b = map;
        this.c = dgbdVar;
    }

    @Override // defpackage.dgaw
    public final /* bridge */ /* synthetic */ Object a(String str, Throwable th) {
        return dgcg.a(dgcg.c("getResults " + (true != this.c.b.b.getLooper().getThread().isAlive() ? "(service thread not alive) " : "") + str, th));
    }

    @Override // defpackage.dgaw
    public final /* bridge */ /* synthetic */ Object b(dgau dgauVar) {
        String a = dgauVar.a(this.b);
        dgauVar.close();
        return a;
    }
}
