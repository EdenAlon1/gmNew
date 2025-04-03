package defpackage;

import java.io.File;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbt extends ffkk implements ffix {
    final /* synthetic */ lcc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbt(lcc lccVar) {
        super(0);
        this.a = lccVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, lcs] */
    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        lcj lcjVar = (lcj) this.a.a;
        File canonicalFile = ((File) lcjVar.d.invoke()).getCanonicalFile();
        synchronized (lcj.b) {
            String absolutePath = canonicalFile.getAbsolutePath();
            if (lcj.a.contains(absolutePath)) {
                throw new IllegalStateException(a.a(absolutePath, "There are multiple DataStores active for the same file: ", ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled)."));
            }
            Set set = lcj.a;
            absolutePath.getClass();
            set.add(absolutePath);
        }
        canonicalFile.getClass();
        return new lcm(canonicalFile, lcjVar.e, lcjVar.c.invoke(canonicalFile), new lci(canonicalFile));
    }
}
