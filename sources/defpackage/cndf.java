package defpackage;

import android.util.Patterns;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cndf {
    public static final engw a(final ConversationIdType conversationIdType, String str, int i) {
        str.getClass();
        ekzz f = eleg.f("ReactedMessageMatcher#findMatchingMessages");
        try {
            List b = b(c(blyg.e(conversationIdType, i).b()), str);
            if (b.isEmpty()) {
                buxo d = MessagesTable.d();
                d.x(i);
                d.f(new Function() { // from class: cndd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((buum) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d.h(new Function() { // from class: cnde
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        buxzVar.m(ConversationIdType.this);
                        buxzVar.B(true);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buum buumVar = MessagesTable.c;
                d.d(new buxl(buumVar.i, false), new buxl(buumVar.a, false));
                b = ffdx.aj(b(c(d.b()), str), 1);
            }
            ffig.a(f, null);
            if (b.size() == 1 || (b.size() > 1 && ((cndb) ffdx.P(b)).a - ((cndb) b.get(b.size() - 2)).a >= ((Number) cmsk.f.e()).intValue())) {
                engw r = engw.r(((cndb) ffdx.P(b)).b);
                r.getClass();
                return r;
            }
            ArrayList arrayList = new ArrayList(ffdx.n(b, 10));
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((cndb) it.next()).b);
            }
            return engq.a(arrayList);
        } finally {
        }
    }

    private static final List b(List list, String str) {
        CharSequence charSequence;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ffkj.e(((cndb) obj).c, str)) {
                arrayList.add(obj);
            }
        }
        char[] cArr = {8230};
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (str.charAt(length) != cArr[0]) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        charSequence = "";
        String obj2 = charSequence.toString();
        if (arrayList.isEmpty() && Patterns.WEB_URL.matcher(obj2).matches()) {
            String E = ffpc.E(obj2, "http://", obj2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                if (ffkj.e(((cndb) obj3).c, E)) {
                    arrayList2.add(obj3);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList();
            for (Object obj4 : list) {
                cndb cndbVar = (cndb) obj4;
                String str2 = cndbVar.c;
                if (str2 != null && (ffpc.t(str2, obj2) || ffpc.n(cndbVar.c, obj2) || ffpc.n(cndbVar.c, str))) {
                    arrayList.add(obj4);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List c(final dtzj dtzjVar) {
        bwdf c = PartsTable.c();
        c.z("findMatchingMessages");
        c.h(new Function() { // from class: cndc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                bwdmVar.o(dtzj.this);
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = 0;
        c.d(new bwdc(PartsTable.d.j, true));
        engw y = c.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            E next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            PartsTable.BindData bindData = (PartsTable.BindData) next;
            MessageIdType v = bindData.v();
            v.getClass();
            arrayList.add(new cndb(i, v, bindData.K()));
            i = i2;
        }
        return arrayList;
    }
}
