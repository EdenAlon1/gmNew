package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cugi {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffhd m;

    public cugi(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffhd ffhdVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar12.getClass();
        ffhdVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.j = ffbrVar6;
        this.k = ffbrVar7;
        this.l = ffbrVar8;
        this.f = ffbrVar9;
        this.g = ffbrVar10;
        this.h = ffbrVar11;
        this.i = ffbrVar12;
        this.m = ffhdVar;
    }

    public static final void i(cugj cugjVar, final ConversationIdType conversationIdType) {
        if (cugjVar.b != null) {
            return;
        }
        bukw a = buld.a();
        a.z("SpamLoggingMetadata#cacheClassification");
        a.c(new Function() { // from class: cuge
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bulc bulcVar = (bulc) obj;
                bulcVar.b(ConversationIdType.this);
                return bulcVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a.C((String) DesugarArrays.stream(new bukt[]{new bukt(buld.b.h)}).map(new Function() { // from class: bukv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bukt) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        cugjVar.b = a.b().y();
    }

    public static final void j(cugj cugjVar, ConversationIdType conversationIdType) {
        if (cugjVar.c != null) {
            return;
        }
        buxo d = MessagesTable.d();
        d.z("SpamLoggingMetadata#cacheLatestMessages");
        d.g(bdmq.D(conversationIdType));
        d.d(new buxl(MessagesTable.c.i, false));
        Object e = cubs.g.e();
        e.getClass();
        d.x(((Number) e).intValue());
        engw<MessagesTable.BindData> a = d.b().y().a();
        ArrayList arrayList = new ArrayList(ffdx.n(a, 10));
        for (MessagesTable.BindData bindData : a) {
            bindData.getClass();
            arrayList.add(cule.a(bindData));
        }
        cugjVar.c = arrayList;
    }

    public final cugj a(culf culfVar) {
        efbd.b();
        cugj cugjVar = new cugj(((cqoh) this.h.b()).f().toEpochMilli());
        i(cugjVar, culfVar.b);
        h(cugjVar, culfVar.f, culfVar.b);
        e(cugjVar, culfVar.b);
        cugjVar.d = culfVar;
        return cugjVar;
    }

    public final cugj b(ParticipantsTable.BindData bindData, byyt byytVar) {
        efbd.b();
        cugj cugjVar = new cugj(((cqoh) this.h.b()).f().toEpochMilli());
        cugjVar.f = bindData;
        cugjVar.g = byytVar;
        return cugjVar;
    }

    public final Object c(MessageIdType messageIdType, ConversationIdType conversationIdType, cugj cugjVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.m), new cugg(null, this, cugjVar, conversationIdType, messageIdType), ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ereo r7, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, defpackage.cugj r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cugi.d(ereo, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, cugj, ffgu):java.lang.Object");
    }

    public final void e(cugj cugjVar, ConversationIdType conversationIdType) {
        byyt s;
        if (cugjVar.g == null && (s = ((bczy) this.k.b()).s(conversationIdType)) != null) {
            cugjVar.g = s;
        }
    }

    public final void f(cugj cugjVar, ConversationIdType conversationIdType) {
        if (cugjVar.e != null) {
            return;
        }
        cugjVar.e = ((bczy) this.k.b()).L(conversationIdType);
    }

    public final void g(cugj cugjVar, MessageIdType messageIdType, ConversationIdType conversationIdType) {
        MessageCoreData z;
        if (cugjVar.d != null) {
            return;
        }
        j(cugjVar, conversationIdType);
        List list = cugjVar.c;
        list.getClass();
        Object obj = null;
        if (messageIdType != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (ffkj.e(((culf) next).a, messageIdType)) {
                    obj = next;
                    break;
                }
            }
            cugjVar.d = (culf) obj;
            if (cugjVar.d != null || (z = ((bdmq) this.l.b()).z(messageIdType)) == null) {
                return;
            }
            cugjVar.d = cule.b(z);
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (((culf) previous).d) {
                obj = previous;
                break;
            }
        }
        cugjVar.d = (culf) obj;
        if (cugjVar.d == null) {
            buxo d = MessagesTable.d();
            d.z("SpamLoggingMetadata#cacheTargetMessage");
            buxz D = bdmq.D(conversationIdType);
            D.ak(100, 117);
            d.g(D);
            d.d(new buxl(MessagesTable.c.i, false));
            d.x(1);
            engw y = d.b().y();
            y.getClass();
            MessagesTable.BindData bindData = (MessagesTable.BindData) ffdx.U(y);
            if (bindData != null) {
                cugjVar.d = cule.a(bindData);
            }
        }
    }

    public final void h(cugj cugjVar, String str, ConversationIdType conversationIdType) {
        Object obj;
        ParticipantsTable.BindData bindData;
        if (cugjVar.f != null) {
            return;
        }
        f(cugjVar, conversationIdType);
        List list = cugjVar.e;
        list.getClass();
        Object obj2 = null;
        if (str != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (ffkj.e(((ParticipantsTable.BindData) next).S(), str)) {
                    obj2 = next;
                    break;
                }
            }
            bindData = (ParticipantsTable.BindData) obj2;
            if (bindData == null) {
                bindData = ((bdrr) this.j.b()).b(str);
            }
        } else {
            j(cugjVar, conversationIdType);
            List list2 = cugjVar.c;
            list2.getClass();
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((culf) obj).d) {
                        break;
                    }
                }
            }
            culf culfVar = (culf) obj;
            String str2 = culfVar != null ? culfVar.f : null;
            if (str2 != null) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (ffkj.e(((ParticipantsTable.BindData) next2).S(), str2)) {
                        obj2 = next2;
                        break;
                    }
                }
                bindData = (ParticipantsTable.BindData) obj2;
                if (bindData == null) {
                    bindData = (ParticipantsTable.BindData) ffdx.M(list);
                }
            } else {
                bindData = (ParticipantsTable.BindData) ffdx.M(list);
            }
        }
        if (bindData != null) {
            cugjVar.f = bindData;
        }
    }
}
