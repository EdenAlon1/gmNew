package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtf {
    public static final bxro a(final SelfIdentityId selfIdentityId) {
        ekzz f = eleg.f("SelfParticipantsDatabaseOperations#getSelfParticipant");
        try {
            csix.h();
            if (!TextUtils.isEmpty(String.valueOf(selfIdentityId))) {
                bxtc a = bxth.a();
                a.z("SelfParticipantsDatabaseOperations#getSelfParticipant");
                a.c(new Function() { // from class: bdte
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bxtg bxtgVar = (bxtg) obj;
                        bxtgVar.aq(new dtrt("self_participants.participant_id", 1, String.valueOf(String.valueOf(SelfIdentityId.this))));
                        return bxtgVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bxso bxsoVar = (bxso) a.b().o();
                try {
                    r3 = bxsoVar.moveToFirst() ? (bxro) bxsoVar.cO() : null;
                    bxsoVar.close();
                } finally {
                }
            }
            f.close();
            return r3;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
