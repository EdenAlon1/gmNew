package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cims implements cink {
    private final cink a;

    protected cims(cink cinkVar) {
        this.a = cinkVar;
    }

    @Override // defpackage.cink
    public final /* synthetic */ int a() {
        return cini.a(this);
    }

    @Override // defpackage.cink
    public Notification b() {
        throw null;
    }

    @Override // defpackage.cink
    public final cinj c() {
        return ((cind) this.a).b;
    }

    @Override // defpackage.cink
    public String d() {
        return null;
    }

    public final String o() {
        String id;
        Function function = new Function() { // from class: cinc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = cind.e;
                return ((cipf) obj).a();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        cind cindVar = (cind) this.a;
        NotificationChannel m = akb$$ExternalSyntheticApiModelOutline0.m(cindVar.d.map(function).orElse(cindVar.a.g()));
        if (m == null) {
            return "";
        }
        id = m.getId();
        return id;
    }

    public final String toString() {
        return String.format(Locale.US, "%s (id: %s, tag: %s)", ((cind) this.a).c, c(), d());
    }
}
