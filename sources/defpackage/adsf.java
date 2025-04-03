package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsf implements dvuy {
    public static final emyl a = cfvl.y("disable_growthkit_for_hawkeye_tests");
    private final ffbr b;
    private final ffbr c;
    private final eg d;
    private final ffbr e;
    private final ajid f;
    private String g;

    public adsf(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, eg egVar, ajid ajidVar) {
        this.e = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = egVar;
        this.f = ajidVar;
    }

    @Override // defpackage.dvuy
    public final eg a() {
        return this.d;
    }

    @Override // defpackage.dvuy
    public final dvux b(dvuw dvuwVar) {
        ajid ajidVar;
        if (((Boolean) ((cfup) a.get()).e()).booleanValue() || (((ajidVar = this.f) != null && ajidVar.d()) || ((Boolean) ((Optional) this.c.b()).map(new Function() { // from class: adse
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                emyl emylVar = adsf.a;
                return Boolean.valueOf(((akes) obj).b());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue())) {
            return new dvux(false, 2);
        }
        Intent intent = (Intent) ((dvuo) dvuwVar).a.get(dvur.ACTION_POSITIVE);
        if (intent != null) {
            this.g = intent.getAction();
        }
        if (!((Map) this.b.b()).containsKey(this.g)) {
            return new dvux(true, 1);
        }
        adsn adsnVar = (adsn) ((Map) this.b.b()).get(this.g);
        adsnVar.getClass();
        adsnVar.a();
        return new dvux(false, 2);
    }

    @Override // defpackage.dvuy
    public final /* synthetic */ ListenableFuture c(String str) {
        return erqt.i(new dvus(str, new dvul()));
    }

    @Override // defpackage.dvuy
    public final void d(dvur dvurVar) {
        if (((Map) this.e.b()).containsKey(this.g)) {
            adso adsoVar = (adso) ((Map) this.e.b()).get(this.g);
            adsoVar.getClass();
            if (dvurVar == dvur.ACTION_POSITIVE) {
                adsoVar.b(this.d);
            } else if (dvurVar == dvur.ACTION_DISMISS) {
                adsoVar.a(this.d);
            }
        }
    }
}
