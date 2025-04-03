package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqds implements apuh {
    private final aqdv a;
    private final ctml b;

    public aqds(aqdv aqdvVar, ctml ctmlVar) {
        aqdvVar.getClass();
        ctmlVar.getClass();
        this.a = aqdvVar;
        this.b = ctmlVar;
    }

    public static final Long f(bvfs bvfsVar) {
        fbxa o = bvfsVar.o();
        fbsh fbshVar = o.c == 19 ? (fbsh) o.d : fbsh.a;
        fbshVar.getClass();
        fcfy a = fbcy.a(fbshVar);
        if (a == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(14, 0);
        int i = a.b;
        boolean z = (i & 2) != 0;
        int i2 = i & 1;
        if (z && i2 != 0) {
            calendar.getClass();
            faun faunVar = a.c;
            if (faunVar == null) {
                faunVar = faun.a;
            }
            faunVar.getClass();
            g(calendar, faunVar);
            fava favaVar = a.d;
            if (favaVar == null) {
                favaVar = fava.a;
            }
            favaVar.getClass();
            h(calendar, favaVar);
        } else if (z) {
            calendar.getClass();
            fava favaVar2 = a.d;
            if (favaVar2 == null) {
                favaVar2 = fava.a;
            }
            favaVar2.getClass();
            h(calendar, favaVar2);
        } else if (i2 != 0) {
            calendar.clear();
            calendar.getClass();
            faun faunVar2 = a.c;
            if (faunVar2 == null) {
                faunVar2 = faun.a;
            }
            faunVar2.getClass();
            g(calendar, faunVar2);
        }
        return Long.valueOf(calendar.getTimeInMillis());
    }

    private static final void g(Calendar calendar, faun faunVar) {
        calendar.set(faunVar.b, faunVar.c, faunVar.d);
    }

    private static final void h(Calendar calendar, fava favaVar) {
        calendar.set(11, favaVar.b);
        calendar.set(12, favaVar.c);
    }

    @Override // defpackage.apuh
    public final buxo a(buxo buxoVar) {
        bvhd a = bvhn.a();
        a.z("LoadSuggestionShortcutExtension#extendQuery");
        a.c(new Function() { // from class: aqdo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvgn bvgnVar = (bvgn) obj;
                fffs fffsVar = new fffs((byte[]) null);
                fffsVar.add(bvgnVar.a);
                fffsVar.add(bvgnVar.e);
                fffsVar.add(bvgnVar.d);
                fffsVar.add(bvgnVar.g);
                bvgo[] bvgoVarArr = (bvgo[]) ffdx.a(fffsVar).toArray(new bvgo[0]);
                return (bvgo[]) Arrays.copyOf(bvgoVarArr, bvgoVarArr.length);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvhc b = a.b();
        bvgo bvgoVar = bvhn.c.b;
        buun buunVar = MessagesTable.c.a;
        bvhm bvhmVar = new bvhm();
        ffgg ffggVar = new ffgg();
        if (this.b.d()) {
            ffggVar.add(fbri.CALENDAR);
        }
        if (this.b.e()) {
            ffggVar.add(fbri.DUO_CALL);
        }
        if (this.b.l()) {
            ffggVar.add(fbri.STARRING);
        }
        bvhmVar.f(fffi.a(ffggVar));
        buxoVar.G(b.s(bvgoVar, buunVar, new bvhg(bvhmVar)).g());
        return buxoVar;
    }

    @Override // defpackage.apuh
    public final boolean c() {
        Object e = ((cfup) ctjd.bJ.get()).e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }

    @Override // defpackage.apuh
    public final void d(apuf apufVar, MessagesTable.BindData bindData, aoug aougVar, enhk enhkVar, amfx amfxVar, aptd aptdVar) {
        bindData.getClass();
        aougVar.getClass();
        enhkVar.getClass();
        amfxVar.getClass();
        String[] strArr = bvhn.a;
        Iterator a = ffjw.a((bvfs[]) bindData.aG("p2p_suggestions", new bvfs[0]));
        while (a.hasNext()) {
            bvfs bvfsVar = (bvfs) a.next();
            if (bvfsVar.m() != fbre.CONSUMED) {
                bvfsVar.getClass();
                fbri n = bvfsVar.n();
                appu appuVar = null;
                if (n != null) {
                    int ordinal = n.ordinal();
                    if (ordinal == 13) {
                        String q = bvfsVar.q();
                        q.getClass();
                        appuVar = new aqdq(3, q);
                    } else if (ordinal == 23) {
                        Long f = f(bvfsVar);
                        if (f != null) {
                            appuVar = new aqdp(f.longValue(), bvfsVar);
                        }
                    } else if (ordinal == 30) {
                        String q2 = bvfsVar.q();
                        q2.getClass();
                        appuVar = new aqdq(4, q2);
                    }
                }
                if (appuVar != null) {
                    apsm apsmVar = (apsm) apufVar;
                    if (apsmVar.e == null) {
                        apsmVar.e = appuVar;
                    }
                }
            } else if (bvfsVar.n() == fbri.CALENDAR) {
                ((apsm) apufVar).g = new aqdr(bvfsVar);
            }
        }
    }

    @Override // defpackage.apuh
    public final aptb e() {
        return this.a;
    }

    @Override // defpackage.apuh
    public final /* synthetic */ bwdf b(bwdf bwdfVar) {
        return bwdfVar;
    }
}
