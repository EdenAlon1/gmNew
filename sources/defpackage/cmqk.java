package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmqk {
    public static final eprt a(cmrx cmrxVar) {
        cmrxVar.getClass();
        switch (cmrxVar) {
            case UNKNOWN:
            case UNRECOGNIZED:
                Objects.toString(cmrxVar);
                throw new IllegalArgumentException("Cannot log a reaction event with an unspecified surface: ".concat(cmrxVar.toString()));
            case REACTION_BAR:
                return eprt.CONVERSATION_VIEW_SELECTION_BAR;
            case CUSTOM_REACTION_PICKER:
                return eprt.CUSTOM_REACTION_SELECTION_EMOJI_PICKER;
            case DITTO_REACTION_BAR:
                return eprt.DITTO_CONVERSATION_VIEW_SELECTION_BAR;
            case REACTION_SUMMARY:
                return eprt.SUMMARY_VIEW_SELECTION_BAR;
            case EMOTIFY_CREATION:
                return eprt.EMOTIFY_REACTION_CREATION;
            case EMOTIFY_PICKER_SELF_OWNED:
                return eprt.EMOTIFY_PICKER_SELF_OWNED;
            case EMOTIFY_PICKER_AUTO_SAVED:
                return eprt.EMOTIFY_PICKER_AUTO_SAVED;
            case DOUBLE_TAP_TO_REACT:
                return eprt.DOUBLE_TAP_TO_REACT;
            case MEDIA_VIEWER_REACTION_PICKER:
                return eprt.MEDIA_VIEWER_REACTION_PICKER;
            default:
                throw new ffcd();
        }
    }
}
