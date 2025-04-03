package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajid {
    public static final cfup a = cfvl.n(cfvl.b, "disable_popups_for_hawkeye", false);
    public static final cskc b = cskc.g("Bugle", "PopupHost");
    public static final long c = TimeUnit.DAYS.toMillis(1);
    public final ffbr d;
    public final cqoh e;
    public final ejvp f;
    public final ffbr g;
    public ajhy[] h = new ajhy[0];
    public int i = -1;
    public int j;
    public ajhy k;
    private final ffbr l;

    public ajid(ffbr ffbrVar, cqoh cqohVar, ejvp ejvpVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.d = ffbrVar;
        this.e = cqohVar;
        this.f = ejvpVar;
        this.g = ffbrVar2;
        this.l = ffbrVar3;
    }

    public final elfl a(boolean z) {
        if (!z) {
            return elfo.e(-1);
        }
        if (((Boolean) ((Optional) this.l.b()).map(new Function() { // from class: ajhz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfup cfupVar = ajid.a;
                return Boolean.valueOf(((akes) obj).b());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            b.m("Suppressing Popup for retail mode device");
            return elfo.e(-1);
        }
        final int i = this.i;
        if (i == -100) {
            this.i = -1;
            return elfo.e(-1);
        }
        if (i != -1) {
            this.i = -1;
            return this.h[i].b().h(new emwl() { // from class: ajia
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cfup cfupVar = ajid.a;
                    return Integer.valueOf(true != ((Boolean) obj).booleanValue() ? -1 : i);
                }
            }, erpp.a);
        }
        int i2 = this.j;
        ajhy[] ajhyVarArr = this.h;
        if (i2 < ajhyVarArr.length) {
            return ajhyVarArr[i2].b().i(new eroh() { // from class: ajib
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    ajid ajidVar = ajid.this;
                    if (booleanValue) {
                        return elfo.e(Integer.valueOf(ajidVar.j));
                    }
                    ajidVar.j++;
                    return ajidVar.a(true);
                }
            }, erpp.a);
        }
        this.j = 0;
        return elfo.e(-1);
    }

    public final void b() {
        this.k = null;
    }

    public final boolean c() {
        long e = ((ctyx) this.d.b()).e("conversation_list_last_popup_show_timestamp_ms", 0L);
        return e == 0 || this.e.f().toEpochMilli() >= e + c;
    }

    public final boolean d() {
        return this.k != null;
    }

    public final void e(int i) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        if (d()) {
            b.m("triggerPopup : Can't show " + ajig.a(i) + " popup as another popup is showing");
            ajih ajihVar = (ajih) this.g.b();
            this.k.getClass();
            ((akzt) ajihVar.a.b()).e("Bugle.HomeScreen.PopupHost.Trigger.Suppressed", i - 1);
            ((akzt) ajihVar.a.b()).e("Bugle.HomeScreen.PopupHost.Trigger.Suppressor", r1.f() - 1);
            return;
        }
        int i2 = 0;
        while (true) {
            ajhy[] ajhyVarArr = this.h;
            if (i2 >= ajhyVarArr.length) {
                b.m("triggerPopup : Popup name " + ajig.a(i) + " does not match with any valid popups");
                return;
            }
            if (i == ajhyVarArr[i2].f() && !d()) {
                b.m("triggerPopup : triggering new popup ".concat(ajig.a(i)));
                this.i = i2;
                this.f.a(elfo.e(null), "POPUP_KEY");
                return;
            }
            i2++;
        }
    }
}
