package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eprt implements eyge {
    REACTION_SURFACE_TYPE_UNSPECIFIED(0),
    CONVERSATION_VIEW_SELECTION_BAR(1),
    SUMMARY_VIEW_SELECTION_BAR(2),
    DITTO_CONVERSATION_VIEW_SELECTION_BAR(3),
    CUSTOM_REACTION_SELECTION_EMOJI_PICKER(4),
    EMOTIFY_REACTION_CREATION(5),
    EMOTIFY_PICKER_SELF_OWNED(6),
    EMOTIFY_PICKER_AUTO_SAVED(7),
    DOUBLE_TAP_TO_REACT(8),
    MEDIA_VIEWER_REACTION_PICKER(9);

    public final int k;

    eprt(int i) {
        this.k = i;
    }

    public static eprt b(int i) {
        switch (i) {
            case 0:
                return REACTION_SURFACE_TYPE_UNSPECIFIED;
            case 1:
                return CONVERSATION_VIEW_SELECTION_BAR;
            case 2:
                return SUMMARY_VIEW_SELECTION_BAR;
            case 3:
                return DITTO_CONVERSATION_VIEW_SELECTION_BAR;
            case 4:
                return CUSTOM_REACTION_SELECTION_EMOJI_PICKER;
            case 5:
                return EMOTIFY_REACTION_CREATION;
            case 6:
                return EMOTIFY_PICKER_SELF_OWNED;
            case 7:
                return EMOTIFY_PICKER_AUTO_SAVED;
            case 8:
                return DOUBLE_TAP_TO_REACT;
            case 9:
                return MEDIA_VIEWER_REACTION_PICKER;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
