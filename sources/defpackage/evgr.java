package defpackage;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgr implements evew {
    private static final febj a;
    private static final enru b;
    private final evgu c;
    private ListenableFuture d;

    static {
        euly eulyVar = euly.a;
        eyfc eyfcVar = ffag.a;
        ffaf ffafVar = new ffaf(eulyVar);
        int i = febj.d;
        a = new febg("x-goog-ext-202964622-bin", ffafVar);
        b = enru.c("com/google/frameworks/client/data/android/phenotype/PhenotypeServerTokensInterceptor");
    }

    public evgr(evgu evguVar) {
        this.c = evguVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.evew
    public final evgb a(eves evesVar) {
        try {
            engw E = engw.E(enoe.a, engw.n(((Map) erqt.q(this.d)).values()));
            eulx eulxVar = (eulx) euly.a.createBuilder();
            int i = ((enou) E).c;
            for (int i2 = 0; i2 < i; i2++) {
                eyee x = eyee.x(Base64.decode((String) E.get(i2), 8));
                eulxVar.copyOnWrite();
                euly eulyVar = (euly) eulxVar.instance;
                eulyVar.a();
                eulyVar.b.add(x);
            }
            euly eulyVar2 = (euly) eulxVar.build();
            febo feboVar = evesVar.a;
            euly eulyVar3 = euly.a;
            febj febjVar = a;
            if (feboVar.h(febjVar)) {
                eulyVar3 = (euly) feboVar.b(febjVar);
                feboVar.m(febjVar, eulyVar3);
            }
            eulx eulxVar2 = (eulx) eulyVar2.toBuilder();
            eygr eygrVar = eulyVar3.b;
            eulxVar2.copyOnWrite();
            euly eulyVar4 = (euly) eulxVar2.instance;
            eulyVar4.a();
            eydl.addAll(eygrVar, eulyVar4.b);
            feboVar.g(febjVar, (euly) eulxVar2.build());
        } catch (ExecutionException e) {
            ((enrr) ((enrr) ((enrr) b.i()).g(e)).h("com/google/frameworks/client/data/android/phenotype/PhenotypeServerTokensInterceptor", "continueRequestHeaderProcessing", 'N', "PhenotypeServerTokensInterceptor.java")).q("Unable to get experiment token.");
        }
        return evgb.a;
    }

    @Override // defpackage.evew
    public final evgb b(eves evesVar) {
        ListenableFuture a2 = this.c.a();
        this.d = a2;
        return evgb.c(a2);
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb c() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb e() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.evew
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.evew
    public final /* synthetic */ void d(ever everVar) {
    }
}
