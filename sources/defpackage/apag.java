package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apag {
    public static final buuo a(MessageIdType messageIdType) {
        buxo d = MessagesTable.d();
        d.e(new Function() { // from class: apaa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                buumVar.getClass();
                return new buun[]{buumVar.a, buumVar.g, buumVar.i, buumVar.r, buumVar.p, buumVar.j};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.z("MessageQueryHelper.getBasicMessageDetailsData");
        buxz buxzVar = new buxz();
        buxzVar.q(messageIdType);
        d.g(buxzVar);
        return (buuo) d.b().o();
    }

    public static final bwav b(Uri uri, MessageIdType messageIdType) {
        bwdf c = PartsTable.c();
        c.e(new Function() { // from class: apac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwat bwatVar = (bwat) obj;
                return new bwau[]{bwatVar.a, bwatVar.d, bwatVar.R};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c.z("MessageQueryHelper.getPartsFileSizeBytes");
        bwdm bwdmVar = new bwdm();
        bwdmVar.v(uri);
        bwdmVar.n(messageIdType);
        c.g(bwdmVar);
        return (bwav) c.b().o();
    }

    public static /* synthetic */ buxo c(String str, String str2, String str3, engw engwVar, int i) {
        if ((i & 1) != 0) {
            String[] strArr = PartsTable.a;
            str = "parts";
        }
        if ((i & 2) != 0) {
            String[] strArr2 = ParticipantsTable.a;
            str2 = "participants";
        }
        if ((i & 4) != 0) {
            String[] strArr3 = bytk.a;
            str3 = "user_references";
        }
        if ((i & 8) != 0) {
            int i2 = engw.d;
            engwVar = enou.a;
        }
        int i3 = i & 16;
        str.getClass();
        str2.getClass();
        str3.getClass();
        engwVar.getClass();
        bwdf c = PartsTable.c();
        c.e(new Function() { // from class: apad
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwat bwatVar = (bwat) obj;
                return (bwau[]) ffdx.i(bwatVar.a, bwatVar.c, bwatVar.d, bwatVar.f, bwatVar.u, bwatVar.v, bwatVar.e, bwatVar.h, bwatVar.i, bwatVar.H, bwatVar.R, bwatVar.l, bwatVar.I, bwatVar.U, bwatVar.b, bwatVar.x, bwatVar.y, bwatVar.P, bwatVar.n, bwatVar.B, bwatVar.X, bwatVar.Y).toArray(new bwau[0]);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        enqv it = engwVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            c = ((apuh) it.next()).b(c);
        }
        buxo d = MessagesTable.d();
        d.e(new Function() { // from class: apae
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                buumVar.getClass();
                return new buun[]{buumVar.a, buumVar.b, buumVar.c, buumVar.i, buumVar.k, buumVar.n, buumVar.y, buumVar.j, buumVar.D, buumVar.r, buumVar.p, buumVar.u, buumVar.I, buumVar.ai, buumVar.C, buumVar.R, buumVar.w, buumVar.J, buumVar.K, buumVar.x, buumVar.g, buumVar.P, buumVar.ac, buumVar.af, buumVar.V};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ((dtri) d.a).o = true;
        bwdd b = c.b();
        bwau bwauVar = PartsTable.d.b;
        buun buunVar = MessagesTable.c.a;
        bwdm bwdmVar = new bwdm();
        bwdmVar.aq(new dtrx("parts._id", 6));
        dtvy s = b.s(bwauVar, buunVar, new bwdj(bwdmVar));
        ((dtrd) s).e = str;
        d.G(s.g());
        if (i3 != 0) {
            String[] strArr4 = bytk.a;
            byth bythVar = new byth(bytk.a);
            bvvn e = ParticipantsTable.e();
            e.e(new Function() { // from class: apab
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvtg bvtgVar = (bvtg) obj;
                    return new bvth[]{bvtgVar.a, bvtgVar.f, bvtgVar.h, bvtgVar.t, bvtgVar.s, bvtgVar.u, bvtgVar.o, bvtgVar.Q, bvtgVar.m, bvtgVar.n, bvtgVar.r, bvtgVar.z};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dtvy i4 = dtvz.i(e.b(), ParticipantsTable.c.a, bytk.c.c);
            ((dtrd) i4).e = str2;
            bythVar.G(i4.g());
            dtvy i5 = dtvz.i(bythVar.b(), bytk.c.b, MessagesTable.c.a);
            ((dtrd) i5).e = str3;
            d.G(i5.g());
        }
        return d;
    }
}
