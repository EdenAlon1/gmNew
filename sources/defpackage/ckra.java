package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckra {
    public static final cskc a = cskc.g("BugleGroupManagement", "GroupManagementAnalyticsImpl");
    public final ckrd b;
    public final ffbr c;
    public final ckru d;
    public final errm e;
    public final errm f;
    private final ckds g;

    public ckra(ckrd ckrdVar, ckds ckdsVar, ffbr ffbrVar, ckru ckruVar, errm errmVar, errm errmVar2) {
        this.b = ckrdVar;
        this.g = ckdsVar;
        this.c = ffbrVar;
        this.d = ckruVar;
        this.e = errmVar;
        this.f = errmVar2;
    }

    public final elfl a(ConversationIdType conversationIdType) {
        final ckds ckdsVar = this.g;
        elfl e = elfo.e(conversationIdType);
        ckdsVar.getClass();
        return e.h(new emwl() { // from class: ckqw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ckds.this.q((ConversationIdType) obj);
            }
        }, this.e);
    }
}
