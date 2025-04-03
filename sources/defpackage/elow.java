package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum elow {
    NEXT_FIELD("NextField"),
    PREVIOUS_FIELD("PreviousField"),
    EDIT("Edit"),
    SAVE("Save"),
    SAVE_AND_CLOSE("SaveAndClose"),
    SEND("Send"),
    UNDO("Undo"),
    REDO("Redo"),
    GO_BACK("GoBack"),
    CLEAR_ALL("ClearAll");

    private final String l;

    elow(String str) {
        this.l = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.l;
    }
}
