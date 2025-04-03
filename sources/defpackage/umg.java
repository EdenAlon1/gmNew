package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umg implements dqlv, uic {
    private final ea c;
    private final Context d;
    private final uco e;
    private final adgn f;
    private final adgn g;
    private final alcb h;
    private final Supplier i;
    private final aepg j;
    private final drun k;
    private static final List b = ffdx.g(eohh.GALLERY_CHOOSER, eohh.GALLERY_LIBRARY, eohh.DEVICE_CAMERA_APP, eohh.CAMERA, eohh.FULLSCREEN_CAMERA, eohh.VIDEO_TRIMMER);
    public static final ffbz a = ffca.a(new ffix() { // from class: umc
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = umg.a;
            eptq eptqVar = (eptq) eptv.a.createBuilder();
            epts eptsVar = epts.CAMERA_GALLERY;
            eptqVar.copyOnWrite();
            eptv eptvVar = (eptv) eptqVar.instance;
            eptvVar.c = eptsVar.v;
            eptvVar.b |= 1;
            eptu eptuVar = eptu.EXPANDED;
            eptqVar.copyOnWrite();
            eptv eptvVar2 = (eptv) eptqVar.instance;
            eptvVar2.d = eptuVar.e;
            eptvVar2.b |= 2;
            eptv eptvVar3 = (eptv) eptqVar.build();
            dcle dcleVar = dcle.a;
            int i = dclf.b;
            return new dclg(eptvVar3);
        }
    });

    public umg(ea eaVar, Context context, uco ucoVar, adgn adgnVar, adgn adgnVar2, alcb alcbVar, adgn adgnVar3, Supplier supplier) {
        this.c = eaVar;
        this.d = context;
        this.e = ucoVar;
        this.f = adgnVar;
        this.g = adgnVar2;
        this.h = alcbVar;
        this.i = supplier;
        this.j = (aepg) adgnVar.a().orElse(null);
        this.k = (drun) adgnVar3.a().orElse(null);
    }

    static /* synthetic */ MessagePartCoreData f(umg umgVar, drnl drnlVar, boolean z, Enum r7, int i) {
        int i2 = i & 2;
        doxr doxrVar = drnlVar.f;
        if (z && (i2 == 0)) {
            if (!(doxrVar instanceof dpgo)) {
                throw new IllegalStateException("Check failed.");
            }
            uco ucoVar = umgVar.e;
            String str = drnlVar.b;
            uez o = ufa.o();
            o.l(Uri.parse(str));
            o.g(drjy.a(drnlVar.a).a());
            ((ueh) o).a = new Size(drnlVar.c, drnlVar.d);
            o.f(uee.a(doxrVar));
            o.j(drnlVar.e.toEpochMilli());
            o.e(uil.a((dpgo) doxrVar, 3));
            o.h(drnlVar.g.toMillis());
            return ucoVar.a(o.m(), umd.a());
        }
        if ((i & 16) != 0) {
            r7 = null;
        }
        uco ucoVar2 = umgVar.e;
        String str2 = drnlVar.b;
        ufk o2 = GalleryContent.o();
        o2.k(Uri.parse(str2));
        o2.f(drjy.a(drnlVar.a).a());
        ((uec) o2).a = new Size(drnlVar.c, drnlVar.d);
        o2.g(drnlVar.g.toMillis());
        o2.e(uee.a(doxrVar));
        o2.i(drnlVar.e.toEpochMilli());
        o2.j(r7 == drwg.a ? byza.GOOGLE_PHOTOS_LINK : byza.STANDARD);
        return ucoVar2.a(o2.l(), umd.a());
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        Object obj;
        drnl drnlVar = (drnl) doxsVar;
        doxr doxrVar = drnlVar.f;
        if (doxrVar instanceof dpgo) {
            MessagePartCoreData f = f(this, drnlVar, true, null, 16);
            obj = this.i.get();
            int c = ((ugl) obj).c(f);
            if (c < 0) {
                return new dqmk(new uia(drnlVar));
            }
            this.h.g(f.O(), c);
            return dqmj.a;
        }
        if ((doxrVar instanceof dpgq) || (doxrVar instanceof dpgj) || (doxrVar instanceof VideoTrimmerSource) || (doxrVar instanceof doya)) {
            return e(drnlVar, ffguVar);
        }
        Objects.toString(doxrVar);
        throw new IllegalStateException("Invalid AttachmentSource: ".concat(doxrVar.toString()));
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void c(doxs doxsVar) {
        ((drnl) doxsVar).getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
        Object obj;
        MessagePartCoreData f = f(this, (drnl) doxsVar, false, null, 30);
        obj = this.i.get();
        ((ugl) obj).h(f);
        this.h.h(f.O());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r11 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008b, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.drnl r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umg.e(drnl, ffgu):java.lang.Object");
    }

    @Override // defpackage.uic
    public final /* synthetic */ ffji h() {
        return umf.a;
    }

    @Override // defpackage.uic
    public final boolean i(MessagePartCoreData messagePartCoreData) {
        messagePartCoreData.getClass();
        return messagePartCoreData.bD() && b.contains(messagePartCoreData.N());
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void b() {
    }
}
