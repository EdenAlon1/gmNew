package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingService;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingServiceAndroidV;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbif implements cbic {
    private static final cskc b = cskc.g("BugleResizing", "ResizingManager");
    public final Context a;
    private final cbhp c;
    private final cbij d;
    private final cins e;
    private final cbia f;
    private final ffbr g;
    private volatile cbid h = null;
    private int i = 0;
    private int j = 0;
    private final HashSet k = new HashSet();
    private ConversationId l = InvalidConversationId.a;

    public cbif(Context context, cbhp cbhpVar, cbij cbijVar, cbia cbiaVar, cins cinsVar, ffbr ffbrVar) {
        this.a = context;
        this.c = cbhpVar;
        this.d = cbijVar;
        this.e = cinsVar;
        this.f = cbiaVar;
        this.g = ffbrVar;
    }

    @Override // defpackage.cbic
    public final void a(Uri uri) {
        this.k.add(uri);
    }

    public final cbid b() {
        cbif cbifVar;
        cbid cbiiVar;
        csjb a = b.a();
        a.A("finishedJobs", this.k);
        a.r();
        bwdf c = PartsTable.c();
        c.z("getAllPartsThatNeedProcessing");
        c.r();
        c.h(new Function() { // from class: cbhx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                bwdmVar.s();
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = 0;
        c.d(new bwdc(PartsTable.d.j, false));
        bwav bwavVar = (bwav) c.b().o();
        cbia cbiaVar = this.f;
        try {
            ArrayList<MessagePartCoreData> arrayList = new ArrayList(bwavVar.getCount());
            while (bwavVar.moveToNext()) {
                arrayList.add(cbiaVar.b.f(bwavVar));
            }
            bwavVar.close();
            cbid cbidVar = null;
            MessagePartCoreData messagePartCoreData = null;
            int i2 = 0;
            for (MessagePartCoreData messagePartCoreData2 : arrayList) {
                if (!this.k.contains(messagePartCoreData2.w())) {
                    if (messagePartCoreData == null) {
                        messagePartCoreData = messagePartCoreData2;
                    }
                    if (messagePartCoreData2.bo()) {
                        i++;
                    } else if (messagePartCoreData2.bD()) {
                        i2++;
                    }
                }
            }
            this.i = i;
            this.j = i2;
            this.e.v(this.l, i, i2);
            if (messagePartCoreData == null) {
                return null;
            }
            if (messagePartCoreData.bo()) {
                cbhp cbhpVar = this.c;
                Context context = (Context) cbhpVar.a.b();
                context.getClass();
                ((cbia) cbhpVar.c.b()).getClass();
                bazm bazmVar = (bazm) cbhpVar.d.b();
                bazmVar.getClass();
                cbifVar = this;
                cbiiVar = new cbho(context, cbhpVar.b, bazmVar, messagePartCoreData, cbifVar);
            } else {
                cbifVar = this;
                if (!messagePartCoreData.bD()) {
                    csjb e = b.e();
                    e.I("Unsupported type.");
                    e.A("contentType", messagePartCoreData.V());
                    e.r();
                    ((akzt) cbifVar.g.b()).c("Bugle.Media.Attachment.Resize.UnsupportedType.Count");
                    cbifVar.h = cbidVar;
                    return cbifVar.h;
                }
                cbij cbijVar = cbifVar.d;
                Context context2 = (Context) cbijVar.a.b();
                context2.getClass();
                albq albqVar = (albq) cbijVar.b.b();
                albqVar.getClass();
                ctfi ctfiVar = (ctfi) cbijVar.c.b();
                ctfiVar.getClass();
                ((cbia) cbijVar.d.b()).getClass();
                bazm bazmVar2 = (bazm) cbijVar.e.b();
                bazmVar2.getClass();
                cbiiVar = new cbii(context2, albqVar, ctfiVar, bazmVar2, messagePartCoreData, cbifVar);
                cbifVar = cbifVar;
            }
            cbidVar = cbiiVar;
            cbifVar.h = cbidVar;
            return cbifVar.h;
        } finally {
        }
    }

    public final void c(Iterable iterable, ConversationId conversationId) {
        ekzz f;
        ekzz f2 = eleg.f("ResizingManager#attachmentsChanged");
        try {
            csix.h();
            if (iterable != null && iterable.iterator().hasNext() && !(conversationId instanceof InvalidConversationId)) {
                this.l = conversationId;
            }
            cbid cbidVar = this.h;
            int i = 0;
            if (cbidVar != null) {
                f = eleg.f("ResizingManager::maybeCancel");
                try {
                    csix.h();
                    if (!cbidVar.f) {
                        final Uri uri = cbidVar.b;
                        final Uri uri2 = cbidVar.c;
                        bwdf c = PartsTable.c();
                        c.z("isAttachmentNeedsProcessing");
                        c.h(new Function() { // from class: cbhy
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bwdm bwdmVar = (bwdm) obj;
                                bwdmVar.r(uri);
                                bwdmVar.v(uri2);
                                return bwdmVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        c.d(new bwdc(PartsTable.d.j, false));
                        c.x(1);
                        c.f(new Function() { // from class: cbhz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((bwat) obj).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bwav bwavVar = (bwav) c.b().o();
                        try {
                            boolean moveToNext = bwavVar.moveToNext();
                            bwavVar.close();
                            if (!moveToNext) {
                                csjb a = cbid.a.a();
                                a.I("Aborting");
                                a.I(cbidVar.getClass().getName());
                                a.A("contentUri", cbidVar.c);
                                a.A("outputUri", cbidVar.b);
                                a.z("maxFileSize", cbidVar.d);
                                a.r();
                                cbidVar.a();
                            }
                        } finally {
                        }
                    }
                    f.close();
                } finally {
                }
            }
            if (iterable != null) {
                final Intent putExtra = Build.VERSION.SDK_INT >= 35 ? new Intent(this.a, (Class<?>) ResizingServiceAndroidV.class).setFlags(1).putExtra("op", 0) : new Intent(this.a, (Class<?>) ResizingService.class).setFlags(1).putExtra("op", 0);
                Iterator it = iterable.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                    if (messagePartCoreData.bu() && messagePartCoreData.w() != null) {
                        putExtra.setData(messagePartCoreData.t());
                        f = eleg.f("ResizingManager::startForegroundService");
                        try {
                            cgcs.a(new cgcr() { // from class: cbie
                                @Override // defpackage.cgcr
                                public final void a() {
                                    cbif.this.a.startForegroundService(putExtra);
                                }
                            });
                            f.close();
                            if (messagePartCoreData.bo()) {
                                i++;
                            } else if (messagePartCoreData.bD()) {
                                i2++;
                            }
                            csjb a2 = b.a();
                            a2.I("start resizing.");
                            a2.A("contentUri", messagePartCoreData.t());
                            a2.r();
                        } finally {
                        }
                    }
                }
                if (i > 0 || i2 > 0) {
                    int i3 = this.i + i;
                    this.i = i3;
                    int i4 = this.j + i2;
                    this.j = i4;
                    this.e.v(this.l, i3, i4);
                }
            }
            f2.close();
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
