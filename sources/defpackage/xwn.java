package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwn extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xwu c;
    final /* synthetic */ drng d;
    final /* synthetic */ ffix e;
    final /* synthetic */ zxl f;
    final /* synthetic */ fgcm g;
    final /* synthetic */ fgcm h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwn(ffgu ffguVar, xwu xwuVar, drng drngVar, ffix ffixVar, zxl zxlVar, fgcm fgcmVar, fgcm fgcmVar2) {
        super(3, ffguVar);
        this.c = xwuVar;
        this.d = drngVar;
        this.e = ffixVar;
        this.f = zxlVar;
        this.g = fgcmVar;
        this.h = fgcmVar2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xwn xwnVar = new xwn((ffgu) obj3, this.c, this.d, this.e, this.f, this.g, this.h);
        xwnVar.i = (ffxy) obj;
        xwnVar.b = (Object[]) obj2;
        return xwnVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffix ffixVar;
        float f;
        dowd dowdVar;
        Object dlvjVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r2 = this.i;
            Object[] objArr = (Object[]) this.b;
            Object obj2 = objArr[0];
            obj2.getClass();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            Object obj3 = objArr[1];
            obj3.getClass();
            boolean booleanValue2 = ((Boolean) obj3).booleanValue();
            Object obj4 = objArr[2];
            obj4.getClass();
            xwk xwkVar = new xwk(booleanValue, booleanValue2, ((Boolean) obj4).booleanValue(), (Long) objArr[3], (Float) objArr[4]);
            boolean z = xwkVar.a;
            boolean z2 = xwkVar.b;
            boolean z3 = xwkVar.c;
            Long l = xwkVar.d;
            Float f2 = xwkVar.e;
            drng drngVar = this.d;
            xwt xwtVar = new xwt(z, this.f, this.g, this.h);
            ffix ffixVar2 = this.e;
            long millis = drngVar.e.toMillis();
            if (f2 != null) {
                f = f2.floatValue();
                ffixVar = ffixVar2;
            } else if (millis <= 0 || l == null) {
                ffixVar = ffixVar2;
                f = 0.0f;
            } else {
                ffixVar = ffixVar2;
                f = l.longValue() / millis;
            }
            dlvo dlvoVar = new dlvo(f, xwtVar, ffixVar);
            xws xwsVar = new xws(z, this.f);
            long millis2 = this.d.e.toMillis();
            if (f2 != null) {
                millis2 = (long) (f2.floatValue() * millis2);
            } else if (l != null) {
                millis2 = l.longValue();
            }
            long j = millis2;
            if (((Boolean) ardj.g.e()).booleanValue()) {
                dtfd dtfdVar = this.d.f.c;
                if (dtfdVar == null) {
                    dtfdVar = dtfd.a;
                }
                dtfdVar.getClass();
                dowdVar = dtfe.b(dtfdVar, true);
            } else {
                dowdVar = null;
            }
            dowd dowdVar2 = dowdVar;
            if (z3) {
                ensk f3 = xwu.a.f();
                f3.Y(ente.a, "BugleComposeRow2");
                ((enrr) f3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/audio/DraftAudioAttachmentUiAdapter$convert$$inlined$combineWithLogging-exY8QGI$2$3", "invokeSuspend", 112, "DraftAudioAttachmentUiAdapter.kt")).t("Audio attachment hasError %s", this.d);
                String str = this.d.c;
                dlvjVar = new dlve(str == null ? "" : str, null, true, false, false, null, 246);
            } else if (z2) {
                ensk f4 = xwu.a.f();
                f4.Y(ente.a, "BugleComposeRow2");
                ((enrr) f4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/audio/DraftAudioAttachmentUiAdapter$convert$$inlined$combineWithLogging-exY8QGI$2$3", "invokeSuspend", 119, "DraftAudioAttachmentUiAdapter.kt")).t("Audio attachment isLoading %s", this.d);
                drng drngVar2 = this.d;
                dlvg dlvgVar = new dlvg(false, false);
                String str2 = drngVar2.c;
                dlvjVar = new dlvn(str2 == null ? "" : str2, null, dowdVar2, true, false, false, null, j, null, dlvgVar);
            } else {
                ensk f5 = xwu.a.f();
                f5.Y(ente.a, "BugleComposeRow2");
                enrr enrrVar = (enrr) f5;
                enrrVar.W(2, TimeUnit.SECONDS);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/audio/DraftAudioAttachmentUiAdapter$convert$$inlined$combineWithLogging-exY8QGI$2$3", "invokeSuspend", 131, "DraftAudioAttachmentUiAdapter.kt")).K("Audio attachment loaded isPlaying: %b, currentPosition: %d, seekProgress: %d, %s", Boolean.valueOf(z), l, new Integer((int) (100.0f * (f2 != null ? f2.floatValue() : 0.0f))), this.d);
                drng drngVar3 = this.d;
                xwr xwrVar = new xwr(this.f);
                String str3 = drngVar3.c;
                dlvjVar = new dlvj(str3 == null ? "" : str3, null, dowdVar2, true, false, false, z, j, xwsVar, dlvoVar, xwrVar, null, null, null, 14386);
            }
            this.a = 1;
            if (r2.fQ(dlvjVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
