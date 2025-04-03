package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import io.grpc.Status;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdlw implements cdls {
    public static final cskc a = cskc.g("BugleCms", "CmsMediaDeletionHandlerImpl");
    private final crty b;
    private final errl c;

    public cdlw(crty crtyVar, errl errlVar) {
        this.b = crtyVar;
        this.c = errlVar;
    }

    @Override // defpackage.cdls
    public final elfl a(final MessageIdType messageIdType) {
        Object apply;
        HashSet hashSet = new HashSet();
        final ArrayList arrayList = new ArrayList();
        String[] strArr = bqii.a;
        bqif bqifVar = new bqif(bqii.a);
        bqifVar.z("deleteBlobsForMessage");
        apply = new Function() { // from class: cdlu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqih bqihVar = (bqih) obj;
                bqihVar.b(MessageIdType.this.b());
                return bqihVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bqih());
        bqifVar.k(new bqig((bqih) apply));
        bqhv bqhvVar = (bqhv) bqifVar.b().o();
        while (bqhvVar.moveToNext()) {
            try {
                String c = bqhvVar.c();
                if (!TextUtils.isEmpty(c)) {
                    csjb c2 = a.c();
                    c2.I("Schedule deletion of blob");
                    c2.A("Blob id", c);
                    c2.A("Message id", messageIdType);
                    c2.r();
                    hashSet.add(c);
                }
            } catch (Throwable th) {
                try {
                    bqhvVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bqhvVar.close();
        if (hashSet.isEmpty()) {
            return elfo.e(null);
        }
        arrayList.addAll(hashSet);
        return this.b.ac(arrayList).h(new emwl() { // from class: cdlv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final MessageIdType messageIdType2;
                List list;
                Object apply2;
                eygr eygrVar = ((esvk) obj).b;
                int i = 0;
                boolean z = false;
                while (true) {
                    messageIdType2 = messageIdType;
                    list = arrayList;
                    if (i >= eygrVar.size()) {
                        break;
                    }
                    fagm fagmVar = (fagm) eygrVar.get(i);
                    final String str = (String) list.get(i);
                    int i2 = fagmVar.b;
                    if (i2 == Status.Code.OK.value() || i2 == Status.Code.NOT_FOUND.value()) {
                        try {
                            String[] strArr2 = bqii.a;
                            bqib bqibVar = new bqib();
                            bqibVar.f("processDeleteFileResponse");
                            apply2 = new Function() { // from class: cdlt
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bqih bqihVar = (bqih) obj2;
                                    bqihVar.b(MessageIdType.this.b());
                                    bqihVar.aq(new dtrt("cms_blobs_pending_delete.blob_id", 1, String.valueOf(str)));
                                    return bqihVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }.apply(new bqih());
                            bqibVar.b = new bqig((bqih) apply2);
                            bqibVar.d();
                            csjb c3 = cdlw.a.c();
                            c3.I("Blob is deleted successfully");
                            c3.A("message id", messageIdType2);
                            c3.A("blob id", str);
                            c3.r();
                        } catch (Exception unused) {
                        }
                        i++;
                    } else {
                        csjb e = cdlw.a.e();
                        e.I("Blob deletion failed, will retry");
                        e.A("message id", messageIdType2);
                        e.A("blob id", str);
                        e.r();
                    }
                    z = true;
                    i++;
                }
                if (list.size() > eygrVar.size()) {
                    csjb c4 = cdlw.a.c();
                    c4.I("Files in batch request exceed server batch size. More files need to be deleted.");
                    c4.A("message_id", messageIdType2);
                    c4.r();
                } else if (!z) {
                    return null;
                }
                throw new cdlr();
            }
        }, this.c);
    }
}
