package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dimn {
    private static final dktn x = new dktn("RcsFlags");
    private static final Object y = new Object();
    public static volatile dimn a = null;
    public static volatile dinl b = null;
    private static volatile Optional z = Optional.empty();
    static final Boolean c = true;
    static final Boolean d = true;
    static final Long e = Long.valueOf(TimeUnit.SECONDS.toMillis(10));
    static final Long f = Long.valueOf(TimeUnit.MINUTES.toMillis(20));
    static final Integer g = 102400;
    static final Integer h = 10240;
    static final Integer i = Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10));
    static final Long j = Long.valueOf(TimeUnit.MINUTES.toSeconds(30));
    static final Long k = 5L;
    static final Integer l = -1;
    static final Integer m = -1;
    static final Boolean n = true;
    static final Boolean o = false;
    static final Boolean p = false;
    static final Boolean q = false;
    static final Boolean r = false;
    static final Boolean s = false;
    static final Boolean t = true;
    static final Boolean u = false;
    public static final long v = TimeUnit.MINUTES.toMillis(15);
    public static final long w = TimeUnit.HOURS.toMillis(24);

    public static dimn E() {
        if (a == null) {
            H(((diml) dipp.a(diml.class)).a());
        }
        if (((Boolean) djai.t().a.T.a()).booleanValue() && (!((Boolean) djai.t().a.V.a()).booleanValue() || dkuy.f(((diml) dipp.a(diml.class)).a()))) {
            if (b == null) {
                dkty.d(x, "Amber enabled, setting mobileConfigurationInstance", new Object[0]);
                b = ((diml) dipp.a(diml.class)).b();
            }
            if (((Boolean) djai.t().a.S.a()).booleanValue()) {
                dkty.d(x, "logging RcsFlags.get() call stack", new Object[0]);
                Thread.dumpStack();
            }
            if (djai.z()) {
                if (b != null) {
                    return b;
                }
                throw new IllegalStateException("RcsFlags is not initialized!");
            }
        }
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Legacy RcsFlags is not initialized!");
    }

    public static void H(Context context) {
        synchronized (y) {
            dkty.d(x, "createFlags", new Object[0]);
            dinp dinpVar = new dinp(context);
            z.isPresent();
            StringBuilder sb = new StringBuilder();
            sb.append("<<< RcsFlags::");
            sb.append(String.format("Phenotype (%s)", "com.google.android.ims.library"));
            sb.append(" >>>");
            for (dimm dimmVar : dinpVar.G()) {
                sb.append(System.lineSeparator());
                sb.append(dimmVar.b());
                sb.append("=");
                sb.append(dimmVar.a());
            }
            dkty.d(x, "%s", sb.toString());
            a = dinpVar;
        }
    }

    public static void I(Context context) {
        dkty.d(x, "initialize RcsFlags", new Object[0]);
        new dimk(context).execute(new Void[0]);
    }

    public static void J(Context context) {
        dkty.d(x, "synchronously initialize RcsFlags", new Object[0]);
        H(context);
    }

    public abstract dimm A();

    public abstract dimm B();

    @Deprecated
    public abstract dimm C();

    public abstract dimm D();

    public ezdl F() {
        List list = (List) Collection.EL.stream(G()).map(new Function() { // from class: dimj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dimm dimmVar = (dimm) obj;
                dimn dimnVar = dimn.a;
                ezdh ezdhVar = (ezdh) ezdi.a.createBuilder();
                String b2 = dimmVar.b();
                ezdhVar.copyOnWrite();
                ezdi ezdiVar = (ezdi) ezdhVar.instance;
                b2.getClass();
                ezdiVar.b |= 1;
                ezdiVar.c = b2;
                String obj2 = dimmVar.a().toString();
                ezdhVar.copyOnWrite();
                ezdi ezdiVar2 = (ezdi) ezdhVar.instance;
                obj2.getClass();
                ezdiVar2.b |= 2;
                ezdiVar2.d = obj2;
                return (ezdi) ezdhVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        ezdj ezdjVar = (ezdj) ezdl.a.createBuilder();
        ezdjVar.copyOnWrite();
        ezdl ezdlVar = (ezdl) ezdjVar.instance;
        ezdlVar.c = L() - 1;
        ezdlVar.b |= 1;
        ezdjVar.copyOnWrite();
        ezdl ezdlVar2 = (ezdl) ezdjVar.instance;
        eygr eygrVar = ezdlVar2.e;
        if (!eygrVar.c()) {
            ezdlVar2.e = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(list, ezdlVar2.e);
        int hashCode = list.hashCode();
        ezdjVar.copyOnWrite();
        ezdl ezdlVar3 = (ezdl) ezdjVar.instance;
        ezdlVar3.b |= 4;
        ezdlVar3.f = hashCode;
        ezdjVar.copyOnWrite();
        ezdl ezdlVar4 = (ezdl) ezdjVar.instance;
        ezdlVar4.b |= 8;
        ezdlVar4.g = true;
        return (ezdl) ezdjVar.build();
    }

    public final List G() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(a());
        arrayList.add(c());
        arrayList.add(e());
        arrayList.add(f());
        arrayList.add(h());
        arrayList.add(i());
        arrayList.add(j());
        arrayList.add(k());
        arrayList.add(l());
        arrayList.add(m());
        arrayList.add(n());
        arrayList.add(p());
        arrayList.add(B());
        arrayList.add(q());
        arrayList.add(s());
        arrayList.add(r());
        arrayList.add(t());
        arrayList.add(u());
        arrayList.add(w());
        arrayList.add(z());
        arrayList.add(A());
        arrayList.add(D());
        arrayList.add(C());
        arrayList.add(d());
        arrayList.add(b());
        arrayList.add(x());
        arrayList.add(g());
        arrayList.add(y());
        arrayList.add(v());
        arrayList.add(o());
        return arrayList;
    }

    public abstract boolean K();

    public abstract int L();

    @Deprecated
    public abstract dimm a();

    @Deprecated
    public abstract dimm b();

    public abstract dimm c();

    @Deprecated
    public abstract dimm d();

    public abstract dimm e();

    public abstract dimm f();

    @Deprecated
    public abstract dimm g();

    public abstract dimm h();

    public abstract dimm i();

    @Deprecated
    public abstract dimm j();

    public abstract dimm k();

    public abstract dimm l();

    @Deprecated
    public abstract dimm m();

    @Deprecated
    public abstract dimm n();

    @Deprecated
    public abstract dimm o();

    public abstract dimm p();

    @Deprecated
    public abstract dimm q();

    public abstract dimm r();

    public abstract dimm s();

    public abstract dimm t();

    public abstract dimm u();

    @Deprecated
    public abstract dimm v();

    public abstract dimm w();

    @Deprecated
    public abstract dimm x();

    @Deprecated
    public abstract dimm y();

    public abstract dimm z();
}
