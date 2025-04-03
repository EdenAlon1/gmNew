package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtky extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dtld c;
    final /* synthetic */ dtiz d;
    final /* synthetic */ dtiu e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtky(ffgu ffguVar, dtld dtldVar, dtiz dtizVar, dtiu dtiuVar) {
        super(3, ffguVar);
        this.c = dtldVar;
        this.d = dtizVar;
        this.e = dtiuVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dtky dtkyVar = new dtky((ffgu) obj3, this.c, this.d, this.e);
        dtkyVar.f = (ffxy) obj;
        dtkyVar.b = (Object[]) obj2;
        return dtkyVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r3 = this.f;
            Object[] objArr = (Object[]) this.b;
            Object obj3 = objArr[0];
            obj3.getClass();
            Object obj4 = objArr[1];
            obj4.getClass();
            drng drngVar = (drng) objArr[2];
            Float f = (Float) objArr[3];
            Object obj5 = objArr[4];
            obj5.getClass();
            Object obj6 = objArr[5];
            obj6.getClass();
            boolean booleanValue = ((Boolean) obj6).booleanValue();
            Object obj7 = objArr[6];
            obj7.getClass();
            dtkv dtkvVar = new dtkv((dtjb) obj3, (Duration) obj4, drngVar, f, (Duration) obj5, booleanValue, (dteh) obj7);
            dtjb dtjbVar = dtkvVar.a;
            Duration duration = dtkvVar.b;
            drng drngVar2 = dtkvVar.c;
            Float f2 = dtkvVar.d;
            Duration duration2 = dtkvVar.e;
            boolean z = dtkvVar.f;
            dteh dtehVar = dtkvVar.g;
            int ordinal = dtjbVar.ordinal();
            if (ordinal == 0) {
                obj2 = dtlh.a;
            } else if (ordinal == 1) {
                this.c.b.c(this.d.i);
                obj2 = new dtli(duration, (Duration) this.d.b.invoke(), this.e);
            } else {
                if (ordinal != 2) {
                    throw new ffcd();
                }
                if (drngVar2 == null) {
                    obj2 = new dtli(duration, (Duration) this.d.b.invoke(), this.e);
                } else {
                    if (!z) {
                        if (this.d.l) {
                            try {
                                dtds dtdsVar = this.c.b;
                                Uri parse = Uri.parse(drngVar2.b);
                                parse.getClass();
                                dtdsVar.d(parse, this.d.i);
                            } catch (IOException e) {
                                ((enrr) ((enrr) dtld.a.j()).g(e).h("com/google/android/libraries/compose/voice/ui/screen/VoiceUiAdapter$createUiDataFlow$$inlined$combine$1$3", "invokeSuspend", 139, "VoiceUiAdapter.kt")).D("Unable to prepare playback. url: %s, duration: %s", drngVar2.b, drngVar2.e);
                                dskj.g(this.c.c, R.string.playback_preparation_failed_message);
                            }
                        } else {
                            dtld dtldVar = this.c;
                            Uri parse2 = Uri.parse(drngVar2.b);
                            parse2.getClass();
                            dtldVar.b.d(parse2, this.d.i);
                        }
                    }
                    Duration duration3 = drngVar2.e;
                    dtld dtldVar2 = this.c;
                    float floatValue = f2 != null ? f2.floatValue() : duration3.toMillis() > 0 ? duration2.toMillis() / duration3.toMillis() : 0.0f;
                    Duration duration4 = drngVar2.e;
                    if (f2 != null) {
                        duration2 = Duration.ofMillis((long) (f2.floatValue() * duration4.toMillis()));
                    }
                    Duration duration5 = duration2;
                    dtds dtdsVar2 = dtldVar2.b;
                    duration5.getClass();
                    dtld dtldVar3 = this.c;
                    dtdy dtdyVar = (dtdy) dtdsVar2;
                    obj2 = new dtlg(duration3, dtdyVar.e, dtdyVar.f, duration5, floatValue, dtldVar3.h, dtehVar, new dtla(dtldVar3));
                }
            }
            this.a = 1;
            if (r3.fQ(obj2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
