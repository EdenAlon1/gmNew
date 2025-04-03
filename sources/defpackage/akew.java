package defpackage;

import android.content.Context;
import android.os.UserManager;
import android.provider.Settings;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akew implements akes {
    public static final enru a = enru.c("com/google/android/apps/messaging/retailmode/RetailModeEntryPointImpl");
    public static final Optional b = Optional.empty();
    public final Context c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public boolean h;
    private final ffsk i;
    private final emyl j;

    public akew(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar) {
        context.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        this.c = context;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.i = ffskVar;
        this.j = emys.a(new emyl() { // from class: aket
            @Override // defpackage.emyl
            public final Object get() {
                boolean isDemoUser;
                akew akewVar = akew.this;
                if (ctib.d()) {
                    isDemoUser = false;
                    if (Settings.Secure.getInt(akewVar.c.getContentResolver(), "shopdemo", 0) == 1) {
                        isDemoUser = true;
                    }
                } else {
                    isDemoUser = ((UserManager) akewVar.d.b()).isDemoUser();
                }
                akewVar.h = true;
                return Boolean.valueOf(isDemoUser);
            }
        });
    }

    @Override // defpackage.akes
    public final void a() {
        axol.k(this.i, null, new akev(this, null), 3);
    }

    @Override // defpackage.akes
    public final boolean b() {
        return d();
    }

    @Override // defpackage.akes
    public final boolean c() {
        return this.h && d();
    }

    public final boolean d() {
        try {
            Object obj = this.j.get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        } catch (Exception e) {
            ((enrr) ((enrr) a.j()).g(e).h("com/google/android/apps/messaging/retailmode/RetailModeEntryPointImpl", "isDemoUser", 109, "RetailModeEntryPointImpl.kt")).q("Failed to check if device is running in Retail Demo mode");
            return false;
        }
    }
}
