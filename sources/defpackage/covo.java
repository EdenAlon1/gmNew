package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class covo {
    public final ffbr a;
    public final cpbs b;
    public final ffbr c;
    public final Context d;
    private final bcwz e;
    private final byzp f;
    private final ffbr g;
    private final ffbr h;

    public covo(Context context, ffbr ffbrVar, cpbs cpbsVar, ffbr ffbrVar2, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.b = cpbsVar;
        this.c = ffbrVar2;
        this.d = context;
        this.e = bcwzVar;
        this.f = byzpVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
    }

    public static String c(couy couyVar) {
        String str = couyVar.f;
        return (str == null || str.length() <= 10000) ? str : str.substring(0, 10000);
    }

    public final MessageCoreData a(coux couxVar, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, int i, byzi byziVar, long j) {
        csix.l(couxVar);
        int i2 = i < 100 ? couxVar.t : couxVar.u;
        byzp byzpVar = this.f;
        String str2 = couxVar.a;
        boolean j2 = couxVar.j();
        String str3 = couxVar.n;
        String str4 = couxVar.o;
        int i3 = couxVar.j;
        String str5 = couxVar.d;
        boolean z = couxVar.m;
        boolean z2 = couxVar.l;
        if (!couxVar.y) {
            couxVar.y = true;
            Iterator it = couxVar.x.iterator();
            long j3 = 0;
            while (it.hasNext()) {
                j3 += ((couy) it.next()).h;
            }
            if (couxVar.f <= 0) {
                long length = couxVar.d != null ? r2.getBytes().length : 0L;
                couxVar.f = length;
                couxVar.f = length + j3;
            }
        }
        MessageCoreData k = byzpVar.k(str2, str, selfIdentityId, conversationIdType, j2, i, str3, str4, i3, str5, z, z2, couxVar.f, i2, couxVar.p, couxVar.h, couxVar.g, couxVar.v, byziVar, j);
        d(k, couxVar);
        return k;
    }

    public final covn b(List list, int i) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((MessagePartCoreData) it.next()).n();
        }
        return new cotm(j, this.b.a(i).d());
    }

    public final void d(MessageCoreData messageCoreData, coux couxVar) {
        final MessagePartData messagePartData;
        for (couy couyVar : couxVar.x) {
            ffbr ffbrVar = this.h;
            byyz byyzVar = byyz.DEFAULT_NO_VERDICT;
            if (((cutu) ffbrVar.b()).b()) {
                byyzVar = byyz.PENDING_VERDICT;
            }
            if (couyVar.e()) {
                messagePartData = this.e.i(c(couyVar));
            } else if (couyVar.c()) {
                bcwz bcwzVar = this.e;
                bcxb C = bcxc.C();
                bcqk bcqkVar = (bcqk) C;
                bcqkVar.c = couyVar.e;
                bcqkVar.d = couyVar.a();
                C.q(-1);
                C.i(-1);
                C.o(eohh.UNKNOWN);
                bcqkVar.n = byyzVar;
                MessagePartData c = bcwzVar.c(C.r());
                String str = couyVar.i;
                if (str != null) {
                    c.aD(Uri.fromFile(new File(str)));
                    if (le.i(couyVar.e)) {
                        c.az(couyVar.i);
                        c.aJ(couyVar.h);
                    }
                }
                messagePartData = c;
            } else {
                messagePartData = null;
            }
            if (messagePartData != null) {
                ((azei) this.g.b()).d(new Consumer() { // from class: covm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((cpwf) obj).c(MessagePartCoreData.this);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                messageCoreData.aL(messagePartData);
            }
        }
        if (((MessageData) messageCoreData).i.iterator().hasNext()) {
            return;
        }
        messageCoreData.aL(this.e.i(""));
    }
}
