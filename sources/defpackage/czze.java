package defpackage;

import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czze extends bcyw {
    final /* synthetic */ czzf a;

    public czze(czzf czzfVar) {
        this.a = czzfVar;
    }

    @Override // defpackage.bcyw
    public final long a() {
        return -1L;
    }

    @Override // defpackage.bcyw
    public final long b() {
        return -1L;
    }

    @Override // defpackage.bcyw
    public final Intent c() {
        return null;
    }

    @Override // defpackage.bcyw
    public final Uri d() {
        if (this.a.s.s() == null) {
            return null;
        }
        return Uri.parse(this.a.s.s());
    }

    @Override // defpackage.bcyw
    public final Optional e() {
        return Optional.empty();
    }

    @Override // defpackage.bcyw
    public final Optional k() {
        return Optional.empty();
    }

    @Override // defpackage.bcyw
    public final String l() {
        bcrs bcrsVar = this.a.s;
        String t = bcrsVar.t();
        String str = (String) bcrsVar.p().map(new Function() { // from class: czzd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfva cfvaVar = aoqm.a;
                return ((aoku) obj).p(((Boolean) new aoov().get()).booleanValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (str == null || str.equals(t) || !this.a.s.B()) {
            return null;
        }
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && str.equals("+18339913448")) {
            return null;
        }
        return str;
    }

    @Override // defpackage.bcyw
    public final String m() {
        return this.a.s.t();
    }

    @Override // defpackage.bcyw
    public final String n() {
        return null;
    }
}
