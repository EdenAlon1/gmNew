package defpackage;

import com.android.vcard.VCardEntry;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qnc implements VCardEntry.EntryElementIterator {
    public boolean a = true;

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final boolean onElement(qnj qnjVar) {
        if (qnjVar.isEmpty()) {
            return true;
        }
        this.a = false;
        return false;
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onElementGroupEnded() {
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onIterationEnded() {
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onIterationStarted() {
    }

    @Override // com.android.vcard.VCardEntry.EntryElementIterator
    public final void onElementGroupStarted(VCardEntry.EntryLabel entryLabel) {
    }
}
