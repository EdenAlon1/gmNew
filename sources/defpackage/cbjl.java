package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjl {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/UpdateMessagePartAfterResizingHelper");
    public final Context b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    private final ffbr h;

    public cbjl(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.b = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.h = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
    }

    public final void a(final MessagePartCoreData messagePartCoreData, final String str, final ContentType contentType, final byzc byzcVar, Action action) {
        boolean z = true;
        if (byzcVar != byzc.SUCCEEDED && byzcVar != byzc.FAILED && byzcVar != byzc.TOO_LARGE) {
            z = false;
        }
        emxf.l(z);
        final Uri t = messagePartCoreData.t();
        t.getClass();
        if (awuq.f("video/mpeg", contentType) || awuq.f("video/mpeg4", contentType)) {
            a(messagePartCoreData, str, ContentType.e("video/mp4"), byzcVar, action);
            return;
        }
        final long b = ((csuu) this.h.b()).b(t);
        if (((Integer) ((dtuu) this.e.b()).c("UpdateMessagePartAfterResizingHelper#executeInTransaction", new emyl() { // from class: cbje
            @Override // defpackage.emyl
            public final Object get() {
                final Uri parse = Uri.parse(str);
                String[] strArr = PartsTable.a;
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("UpdateMessagePartAfterResizingHelper#executeInTransaction");
                byzc byzcVar2 = byzcVar;
                bwdiVar.w(byzcVar2);
                bwdiVar.v();
                final cbjl cbjlVar = cbjl.this;
                ContentType contentType2 = contentType;
                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                final Uri uri = t;
                if (byzcVar2 == byzc.SUCCEEDED) {
                    bwdiVar.z(parse);
                    bwdiVar.j(contentType2.toString());
                } else {
                    long j = b;
                    if (j > 0 && j <= messagePartCoreData2.p()) {
                        if (((asqa) cbjlVar.g.b()).a()) {
                            ctcd ctcdVar = (ctcd) cbjlVar.f.b();
                            final epll epllVar = (epll) eplp.a.createBuilder();
                            epllVar.copyOnWrite();
                            eplp eplpVar = (eplp) epllVar.instance;
                            eplpVar.b |= 32;
                            eplpVar.h = (int) j;
                            int i = le.A(contentType2.toString()) ? 5 : le.j(contentType2.toString()) ? 4 : le.o(contentType2.toString(), false) ? 3 : 2;
                            epllVar.copyOnWrite();
                            eplp eplpVar2 = (eplp) epllVar.instance;
                            eplpVar2.t = epln.a(i);
                            eplpVar2.b |= 131072;
                            epllVar.copyOnWrite();
                            eplp eplpVar3 = (eplp) epllVar.instance;
                            eplpVar3.c = eplm.a(5);
                            eplpVar3.b |= 1;
                            epllVar.copyOnWrite();
                            eplp eplpVar4 = (eplp) epllVar.instance;
                            eplpVar4.v = eplk.a(19);
                            eplpVar4.b |= 524288;
                            ctcdVar.o(new Supplier() { // from class: cbjf
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return (eplp) epll.this.build();
                                }
                            });
                        }
                        bwdiVar.w(byzc.SUCCEEDED);
                        bwdiVar.z(uri);
                    }
                }
                final String aa = messagePartCoreData2.aa();
                bwdiVar.D(new Function() { // from class: cbhw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwdm bwdmVar = (bwdm) obj;
                        bwdmVar.j(aa);
                        return bwdmVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (bwdiVar.b().e() <= 0) {
                    ensk h = cbjl.a.h();
                    h.Y(ente.a, "BugleResizing");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/UpdateMessagePartAfterResizingHelper", "updateInScope", 165, "UpdateMessagePartAfterResizingHelper.java")).t("Attachment for %s gone. Deleting output.", uri);
                    ((dtuu) cbjlVar.e.b()).g(new dtut() { // from class: cbjg
                        @Override // defpackage.dtut
                        public final ekzz a() {
                            return eleg.f("UMPARH::deleteContent1::runAfterCommit");
                        }
                    }, null, new Runnable() { // from class: cbjh
                        @Override // java.lang.Runnable
                        public final void run() {
                            cbgi.j(cbjl.this.b, parse);
                        }
                    });
                } else if (byzcVar2 == byzc.SUCCEEDED) {
                    ((dtuu) cbjlVar.e.b()).g(new dtut() { // from class: cbji
                        @Override // defpackage.dtut
                        public final ekzz a() {
                            return eleg.f("UMPARH::deleteContent2::runAfterCommit");
                        }
                    }, null, new Runnable() { // from class: cbjj
                        @Override // java.lang.Runnable
                        public final void run() {
                            cbgi.j(cbjl.this.b, uri);
                        }
                    });
                }
                return Integer.valueOf(((bdor) cbjlVar.d.b()).a());
            }
        })).intValue() > 0) {
            bajq.d(6, action);
        }
    }
}
