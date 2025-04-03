package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqlw extends dtrs {
    public static final /* synthetic */ int a = 0;
    private final ffjm b;

    public aqlw(ffjm ffjmVar) {
        this.b = ffjmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ Object d(dtyq dtyqVar, dtuk dtukVar) {
        aqln aqlnVar = new aqln(null);
        duaj d = dtukVar.d();
        if (d != null) {
            if (d instanceof bvvq) {
                bvvn e = ParticipantsTable.e();
                e.z("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#1");
                e.r();
                e.e(new Function() { // from class: aqls
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvtg bvtgVar = (bvtg) obj;
                        int i = aqlw.a;
                        return new bvth[]{bvtgVar.a, bvtgVar.d};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                enqv it = ((bvvq) d).e.iterator();
                while (it.hasNext()) {
                    duap duapVar = (duap) it.next();
                    duapVar.getClass();
                    e.k((bvvs) duapVar);
                }
                aqlm.d(e);
                e.v(ParticipantsTable.c.a);
                e.x(10);
                aqlm.b(aqlnVar, e);
            }
            if (d instanceof bwoo) {
                bwon a2 = ProfilesTable.a();
                a2.z("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#1");
                a2.c(new Function() { // from class: aqlt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwnk bwnkVar = (bwnk) obj;
                        int i = aqlw.a;
                        return new bwnl[]{bwnkVar.a, bwnkVar.b};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                enqv it2 = ((bwoo) d).e.iterator();
                while (it2.hasNext()) {
                    duap duapVar2 = (duap) it2.next();
                    duapVar2.getClass();
                    a2.k((bwoq) duapVar2);
                }
                aqlm.e(a2);
                a2.v(ProfilesTable.c.b);
                a2.x(10);
                aqlm.c(aqlnVar, a2);
            }
        }
        duap e2 = dtukVar.e();
        if (e2 != null) {
            if (e2 instanceof bvvs) {
                bvvn e3 = ParticipantsTable.e();
                e3.z("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#2");
                e3.r();
                e3.e(new Function() { // from class: aqlu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvtg bvtgVar = (bvtg) obj;
                        int i = aqlw.a;
                        return new bvth[]{bvtgVar.a, bvtgVar.d};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                e3.k((bvvs) e2);
                aqlm.d(e3);
                e3.v(ParticipantsTable.c.a);
                e3.x(10);
                aqlm.b(aqlnVar, e3);
            }
            if (e2 instanceof bwoq) {
                bwon a3 = ProfilesTable.a();
                a3.z("StatelessParticipantChangeQueryListenerV2#preChangeInTransaction#2");
                a3.c(new Function() { // from class: aqlv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwnk bwnkVar = (bwnk) obj;
                        int i = aqlw.a;
                        return new bwnl[]{bwnkVar.a, bwnkVar.b};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                a3.k((bwoq) e2);
                aqlm.e(a3);
                a3.v(ProfilesTable.c.b);
                a3.x(10);
                aqlm.c(aqlnVar, a3);
            }
        }
        return aqlnVar;
    }

    @Override // defpackage.dtrs
    public final /* synthetic */ void e(dtyq dtyqVar, dtuk dtukVar, Object obj) {
        final ParticipantsTable.BindData b;
        obj.getClass();
        aqln aqlnVar = (aqln) obj;
        dtro b2 = dtukVar.b();
        if (b2 != null) {
            if (b2 instanceof ParticipantsTable.BindData) {
                b = (ParticipantsTable.BindData) b2;
            } else {
                b = ParticipantsTable.b(String.valueOf(((ProfilesTable.BindData) b2).n()));
                b.getClass();
            }
            if (b.r() > -2) {
                aqlnVar.b.set(true);
            } else if (b.S() != null) {
                String[] strArr = bsdr.a;
                bsdm bsdmVar = new bsdm(bsdr.a);
                bsdmVar.z("StatelessParticipantChangeQueryListenerV2#onChangeInTransaction");
                bsdmVar.r();
                bsdmVar.e(new Function() { // from class: aqlo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i = aqlw.a;
                        return ((bscz) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsdmVar.f(new Function() { // from class: aqlp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsdq bsdqVar = (bsdq) obj2;
                        int i = aqlw.a;
                        String S = ParticipantsTable.BindData.this.S();
                        S.getClass();
                        bsdqVar.f(Long.parseLong(S));
                        return bsdqVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsdmVar.x(10);
                aqlm.a(aqlnVar, bsdmVar.b());
            }
        }
        dtro[] a2 = dtukVar.a();
        if (a2 != null) {
            ffdo.L(a2);
            fffs fffsVar = new fffs((byte[]) null);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : fffsVar) {
                if (obj2 instanceof ParticipantsTable.BindData) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj3;
                if (bindData.r() <= -2 && bindData.S() != null) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String S = ((ParticipantsTable.BindData) it.next()).S();
                S.getClass();
                arrayList3.add(Long.valueOf(Long.parseLong(S)));
            }
            fffsVar.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : fffsVar) {
                if (obj4 instanceof ProfilesTable.BindData) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList(ffdx.n(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(Long.valueOf(((ProfilesTable.BindData) it2.next()).n()));
            }
            fffsVar.addAll(arrayList5);
            final List a3 = ffdx.a(fffsVar);
            if (!a3.isEmpty()) {
                String[] strArr2 = bsdr.a;
                bsdm bsdmVar2 = new bsdm(bsdr.a);
                bsdmVar2.z("StatelessParticipantChangeQueryListenerV2#onChangeInTransaction");
                bsdmVar2.r();
                bsdmVar2.e(new Function() { // from class: aqlq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj5) {
                        int i = aqlw.a;
                        return ((bscz) obj5).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsdmVar2.f(new Function() { // from class: aqlr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj5) {
                        bsdq bsdqVar = (bsdq) obj5;
                        int i = aqlw.a;
                        bsdqVar.g(a3);
                        return bsdqVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsdmVar2.x(10);
                aqlm.a(aqlnVar, bsdmVar2.b());
            }
            if (((fffs) a3).c != a2.length) {
                aqlnVar.b.set(true);
            }
        }
        if (aqlnVar.a.isEmpty() && !aqlnVar.b.get()) {
            return;
        }
        this.b.a(engq.f(aqlnVar.a), Boolean.valueOf(aqlnVar.b.get()));
    }
}
