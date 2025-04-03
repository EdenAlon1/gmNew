package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgc {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Executor c;
    private final efbm d;
    private final eroh e;
    private final Map f;
    private final efim g;

    public efgc(Executor executor, efbm efbmVar, efim efimVar, Map map) {
        executor.getClass();
        this.c = executor;
        efbmVar.getClass();
        this.d = efbmVar;
        this.g = efimVar;
        this.f = map;
        emxf.a(!map.isEmpty());
        this.e = new eroh() { // from class: efgb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return erqt.i("");
            }
        };
    }

    public final synchronized effy a(efga efgaVar) {
        effy effyVar;
        Uri uri = ((efer) efgaVar).a;
        effyVar = (effy) this.a.get(uri);
        boolean z = true;
        if (effyVar == null) {
            Uri uri2 = ((efer) efgaVar).a;
            emxf.f(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String b = emxe.b(uri2.getLastPathSegment());
            int lastIndexOf = b.lastIndexOf(46);
            emxf.f((lastIndexOf == -1 ? "" : b.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri2);
            emxf.b(true, "Proto schema cannot be null");
            emxf.b(((efer) efgaVar).c != null, "Handler cannot be null");
            efhs efhsVar = ((efer) efgaVar).e;
            Map map = this.f;
            String b2 = efhsVar.b();
            efif efifVar = (efif) map.get(b2);
            if (efifVar == null) {
                z = false;
            }
            emxf.f(z, "No XDataStoreVariantFactory registered for ID %s", b2);
            String b3 = emxe.b(((efer) efgaVar).a.getLastPathSegment());
            int lastIndexOf2 = b3.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                b3 = b3.substring(0, lastIndexOf2);
            }
            ListenableFuture g = erny.g(erqt.i(((efer) efgaVar).a), this.e, erpp.a);
            efie a = efifVar.a(efgaVar, b3, this.c, this.d);
            efim efimVar = this.g;
            efifVar.b();
            effy effyVar2 = new effy(a, efimVar, g, false);
            engw engwVar = ((efer) efgaVar).d;
            if (!engwVar.isEmpty()) {
                effyVar2.d(new effx(engwVar, this.c));
            }
            this.a.put(uri, effyVar2);
            this.b.put(uri, efgaVar);
            effyVar = effyVar2;
        } else {
            efga efgaVar2 = (efga) this.b.get(uri);
            if (!efgaVar.equals(efgaVar2)) {
                String a2 = emyk.a("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", ((efer) efgaVar).b.getClass().getSimpleName(), ((efer) efgaVar).a);
                emxf.f(((efer) efgaVar).a.equals(efgaVar2.a()), a2, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                emxf.f(((efer) efgaVar).b.equals(efgaVar2.e()), a2, "schema");
                emxf.f(((efer) efgaVar).c.equals(efgaVar2.c()), a2, "handler");
                emxf.f(enkr.h(((efer) efgaVar).d, efgaVar2.d()), a2, "migrations");
                emxf.f(((efer) efgaVar).e.equals(efgaVar2.b()), a2, "variantConfig");
                emxf.f(((efer) efgaVar).f == efgaVar2.f(), a2, "useGeneratedExtensionRegistry");
                efgaVar2.g();
                emxf.f(true, a2, "enableTracing");
                throw new IllegalArgumentException(emyk.a(a2, "unknown"));
            }
        }
        return effyVar;
    }
}
