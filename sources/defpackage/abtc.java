package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtc extends dtrs {
    public static final cfup a = cfvl.i(cfvl.b, "enable_rcs_group_id_update_check", false);
    public final abtr b;
    public final errl c;
    public final elfk d = new elfk();
    public final bsnz e;
    private final dtuu f;

    public abtc(dtuu dtuuVar, abtr abtrVar, errl errlVar) {
        bsob e = bsom.e();
        e.z("rcsGroupIdQuery");
        e.g(new Function() { // from class: absy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfup cfupVar = abtc.a;
                return ((bskp) obj).aa;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.e = e.b();
        this.f = dtuuVar;
        this.b = abtrVar;
        this.c = errlVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        if (((bsod) dtukVar.d()) != null) {
            dtuu dtuuVar = this.f;
            dtut dtutVar = new dtut() { // from class: abta
                @Override // defpackage.dtut
                public final ekzz a() {
                    cfup cfupVar = abtc.a;
                    return eleg.f("CTCL::onChangeInTransaction::runAfterCommit");
                }
            };
            final abtr abtrVar = this.b;
            dtuuVar.g(dtutVar, null, new Runnable() { // from class: abtb
                @Override // java.lang.Runnable
                public final void run() {
                    final abtr abtrVar2 = abtr.this;
                    elfo.f(new Runnable() { // from class: abtm
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((ensz) abtr.a.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/RcsGroupIdUpdateChecker", "evaluate", 89, "RcsGroupIdUpdateChecker.java")).q("Started evaluation.");
                            for (Map.Entry entry : abtr.a().entrySet()) {
                                abtr abtrVar3 = abtr.this;
                                ConversationIdType conversationIdType = (ConversationIdType) entry.getKey();
                                String str = (String) entry.getValue();
                                Optional ofNullable = Optional.ofNullable((String) abtrVar3.e.a.replace(conversationIdType, str));
                                if (ofNullable.isEmpty()) {
                                    ((ensz) abtr.a.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/RcsGroupIdUpdateChecker", "isUnexpectedRcsGroupIdUpdate", 114, "RcsGroupIdUpdateChecker.java")).t("Set RCS Group id to map for the first time in conversation %s", conversationIdType);
                                } else if (!((String) ofNullable.get()).equals(str)) {
                                    ((ensz) ((ensz) abtr.a.h()).h("com/google/android/apps/messaging/custodian/inspectors/misthreading/RcsGroupIdUpdateChecker", "isUnexpectedRcsGroupIdUpdate", 126, "RcsGroupIdUpdateChecker.java")).J("RCS Group Id updated for conversation %s. Old value: %s. New value: %s.", conversationIdType, ofNullable.get(), str);
                                    abuy abuyVar = abtrVar3.d;
                                    abut abutVar = new abut();
                                    abutVar.d(epwn.RCS_GROUP_ID_UPDATED);
                                    abutVar.c((ConversationIdType) entry.getKey());
                                    abuyVar.b(abutVar.e());
                                }
                            }
                        }
                    }, abtrVar2.b).k(axnw.b(), abtrVar2.c);
                }
            });
        }
    }
}
