package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adug implements adtw {
    public final ffbr a;
    public final bcsf b;
    public final bctx c;
    public final czlg d;
    public final bdtd e;
    public final bcsq f;
    public final bcsy g;
    public final atky h;
    public List i = new ArrayList();
    public List j = new ArrayList();
    private final Context k;
    private final errl l;

    public adug(Context context, errl errlVar, ffbr ffbrVar, bcsf bcsfVar, bctx bctxVar, czlg czlgVar, bdtd bdtdVar, bcsq bcsqVar, bcsy bcsyVar, atky atkyVar) {
        this.k = context;
        this.l = errlVar;
        this.a = ffbrVar;
        this.b = bcsfVar;
        this.c = bctxVar;
        this.d = czlgVar;
        this.e = bdtdVar;
        this.f = bcsqVar;
        this.g = bcsyVar;
        this.h = atkyVar;
    }

    @Override // defpackage.adtw
    public final elfl a() {
        return elfo.e(new HashMap());
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final elfl c() {
        return elfo.g(new Callable() { // from class: adue
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String sb;
                SelfIdentityId c;
                aztg d;
                bseh r;
                SelfIdentityId c2;
                aztg d2;
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                adug adugVar = adug.this;
                if (adugVar.h.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    bifu bifuVar = (bifu) adugVar.g.f((MessageIdType[]) adugVar.i.toArray(new MessageIdType[0])).o();
                    while (bifuVar.moveToNext()) {
                        try {
                            bcse c3 = adugVar.b.c(bifuVar);
                            ConversationIdType t = c3.t();
                            if (!hashMap.containsKey(t)) {
                                bseh r2 = ((bczy) adugVar.a.b()).r(t);
                                bctw a = adugVar.c.a(bcui.c(t).y());
                                if (r2 != null) {
                                    hashMap.put(t, r2);
                                }
                                hashMap2.put(t, a);
                            }
                            bseh bsehVar = (bseh) hashMap.get(t);
                            bctw bctwVar = (bctw) hashMap2.get(t);
                            if (bsehVar != null && bctwVar != null && (c2 = aqvf.c(bsehVar.S())) != null && (d2 = adugVar.e.d(c2)) != null) {
                                sb2.append(adugVar.d.a(c3, bctwVar, d2, bsehVar.v()).b);
                            }
                        } finally {
                        }
                    }
                    bifuVar.close();
                    sb = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    bjjd bjjdVar = (bjjd) adugVar.f.g((MessageIdType[]) adugVar.i.toArray(new MessageIdType[0])).o();
                    while (bjjdVar.moveToNext()) {
                        try {
                            bcse e = adugVar.b.e(bjjdVar);
                            ConversationIdType t2 = e.t();
                            if (!hashMap.containsKey(t2)) {
                                bseh r3 = ((bczy) adugVar.a.b()).r(t2);
                                bctw a2 = adugVar.c.a(bcui.c(t2).y());
                                if (r3 != null) {
                                    hashMap.put(t2, r3);
                                }
                                hashMap2.put(t2, a2);
                            }
                            bseh bsehVar2 = (bseh) hashMap.get(t2);
                            bctw bctwVar2 = (bctw) hashMap2.get(t2);
                            if (bsehVar2 != null && bctwVar2 != null && (c = aqvf.c(bsehVar2.S())) != null && (d = adugVar.e.d(c)) != null) {
                                sb3.append(adugVar.d.a(e, bctwVar2, d, bsehVar2.v()).b);
                            }
                        } finally {
                        }
                    }
                    bjjdVar.close();
                    sb = sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder();
                for (ConversationIdType conversationIdType : adugVar.j) {
                    if (!hashMap.containsKey(conversationIdType) && (r = ((bczy) adugVar.a.b()).r(conversationIdType)) != null) {
                        hashMap.put(conversationIdType, r);
                    }
                }
                Stream sorted = Collection.EL.stream(hashMap.keySet()).sorted(Comparator.CC.comparingLong(new ToLongFunction() { // from class: aduf
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj) {
                        return ((ConversationIdType) obj).a;
                    }
                }));
                int i = engw.d;
                engw engwVar = (engw) sorted.collect(endq.a);
                int size = engwVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ConversationIdType conversationIdType2 = (ConversationIdType) engwVar.get(i2);
                    if (hashMap.containsKey(conversationIdType2)) {
                        sb4.append(((bseh) hashMap.get(conversationIdType2)).a());
                    }
                }
                if (!TextUtils.isEmpty(sb)) {
                    arrayList.add(new FileTeleporter(sb.getBytes(StandardCharsets.UTF_8), "Problematic messages"));
                }
                if (!TextUtils.isEmpty(sb4.toString())) {
                    arrayList.add(new FileTeleporter(sb4.toString().getBytes(StandardCharsets.UTF_8), "Problematic conversations"));
                }
                return arrayList;
            }
        }, this.l);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl d() {
        return cfzj.d();
    }

    @Override // defpackage.adtw
    public final eoih e() {
        return eoih.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_PROBLEMATIC_MESSAGES_ADVANCED_INFO;
    }

    @Override // defpackage.adtw
    public final String f() {
        return this.k.getString(R.string.problematic_message_feedback_data_description);
    }

    @Override // defpackage.adtw
    public final String g() {
        return this.k.getString(R.string.problematic_message_feedback_data_detail_title);
    }

    @Override // defpackage.adtw
    public final String h() {
        return this.k.getString(R.string.problematic_message_feedback_data_name);
    }

    @Override // defpackage.adtw
    public final String i() {
        return this.k.getString(R.string.problematic_message_feedback_data_rationale);
    }

    @Override // defpackage.adtw
    public final String j() {
        return this.k.getString(R.string.problematic_message_feedback_data_rationale_title);
    }
}
