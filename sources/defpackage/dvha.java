package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvha implements dvgl {
    private static final entd a = entd.c("GnpSdk");
    private final dvdy b;
    private final Context c;
    private final ListenableFuture d;

    public dvha(Context context, ListenableFuture listenableFuture, dvdy dvdyVar) {
        this.c = context;
        this.d = listenableFuture;
        this.b = dvdyVar;
    }

    @Override // defpackage.dvgl
    public final dvgk a() {
        return dvgk.LANGUAGE;
    }

    @Override // defpackage.emva
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        dvgn dvgnVar = (dvgn) obj2;
        if (((ewag) obj) == null) {
            this.b.c(dvgnVar.a(), "TriggeringConditions is null in LanguagePredicate", new Object[0]);
            return false;
        }
        try {
            return Objects.equals(dvdl.a(this.c), ((SharedPreferences) this.d.get()).getString("SYNC_LANGUAGE", null));
        } catch (InterruptedException | ExecutionException e) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/LanguagePredicate", "apply", 'C', "LanguagePredicate.java")).q("Failed to retrieve SYNC_LANGUAGE_SHARED_PREFS_KEY from shared preferences.");
            return false;
        }
    }
}
