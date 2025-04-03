package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbv {
    private final cmqo a;
    private final aleq b;
    private final auqw c;

    public abbv(cmqo cmqoVar, aleq aleqVar, auqw auqwVar) {
        aleqVar.getClass();
        this.a = cmqoVar;
        this.b = aleqVar;
        this.c = auqwVar;
    }

    public final void a(Long l) {
        e(3, 3, l);
    }

    public final void b(Long l) {
        e(2, 3, l);
    }

    public final void c(cmrm cmrmVar, cmrx cmrxVar, MessageId messageId) {
        eprt eprtVar;
        cmrmVar.getClass();
        cmrxVar.getClass();
        messageId.getClass();
        if (((ersq) ((auqh) this.c).a.b()).a("bugle.use_complete_surface_mappings")) {
            eprtVar = cmqk.a(cmrxVar);
        } else {
            int ordinal = cmrxVar.ordinal();
            if (ordinal == 1) {
                eprtVar = eprt.CONVERSATION_VIEW_SELECTION_BAR;
            } else if (ordinal == 2) {
                eprtVar = eprt.CUSTOM_REACTION_SELECTION_EMOJI_PICKER;
            } else if (ordinal == 5) {
                eprtVar = eprt.EMOTIFY_REACTION_CREATION;
            } else if (ordinal == 8) {
                eprtVar = eprt.DOUBLE_TAP_TO_REACT;
            } else {
                if (ordinal != 9) {
                    Objects.toString(cmrxVar);
                    throw new IllegalArgumentException("Cannot log a reaction event with an unspecified surface: ".concat(cmrxVar.toString()));
                }
                eprtVar = eprt.MEDIA_VIEWER_REACTION_PICKER;
            }
        }
        this.a.a(cmrmVar, eprtVar, messageId.a());
    }

    public final void d(cmrm cmrmVar, cmrx cmrxVar, Long l) {
        int i;
        cmrmVar.getClass();
        cmrxVar.getClass();
        int i2 = 4;
        if (!ffdx.g(cmrx.REACTION_BAR, cmrx.CUSTOM_REACTION_PICKER, cmrx.MEDIA_VIEWER_REACTION_PICKER, cmrx.DOUBLE_TAP_TO_REACT).contains(cmrxVar)) {
            Objects.toString(cmrxVar);
            throw new IllegalArgumentException("Select event not allowed in reaction surface: ".concat(cmrxVar.toString()));
        }
        int ordinal = cmrmVar.ordinal();
        if (ordinal == 1) {
            i = 4;
        } else if (ordinal == 2) {
            i = 6;
        } else {
            if (ordinal != 3) {
                Objects.toString(cmrmVar);
                throw new IllegalArgumentException("Cannot log a reaction event with an unspecified action: ".concat(cmrmVar.toString()));
            }
            i = 5;
        }
        int ordinal2 = cmrxVar.ordinal();
        if (ordinal2 == 1) {
            i2 = 2;
        } else if (ordinal2 == 2) {
            i2 = 3;
        } else if (ordinal2 != 4) {
            if (ordinal2 == 8) {
                i2 = 6;
            } else {
                if (ordinal2 != 9) {
                    Objects.toString(cmrxVar);
                    throw new IllegalArgumentException("Cannot log a reaction event with an unspecified surface: ".concat(cmrxVar.toString()));
                }
                i2 = 5;
            }
        }
        e(i, i2, l);
    }

    public final void e(int i, int i2, Long l) {
        equh a = equg.a((eqku) eqkv.a.createBuilder());
        eqla eqlaVar = (eqla) eqld.a.createBuilder();
        eqlaVar.getClass();
        eqlaVar.copyOnWrite();
        eqld eqldVar = (eqld) eqlaVar.instance;
        eqldVar.c = i - 1;
        eqldVar.b |= 1;
        eqlaVar.copyOnWrite();
        eqld eqldVar2 = (eqld) eqlaVar.instance;
        eqldVar2.d = i2 - 1;
        eqldVar2.b |= 2;
        if (l != null) {
            long longValue = l.longValue();
            eqlaVar.copyOnWrite();
            eqld eqldVar3 = (eqld) eqlaVar.instance;
            eqldVar3.b |= 4;
            eqldVar3.e = longValue;
        }
        aleq aleqVar = this.b;
        eyfy build = eqlaVar.build();
        build.getClass();
        eqku eqkuVar = a.a;
        eqkuVar.copyOnWrite();
        eqkv eqkvVar = (eqkv) eqkuVar.instance;
        eqkvVar.e = (eqld) build;
        eqkvVar.c |= 8;
        aleqVar.a(189043, a.a());
    }
}
