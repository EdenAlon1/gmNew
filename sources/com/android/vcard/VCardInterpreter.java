package com.android.vcard;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface VCardInterpreter {
    void onEntryEnded();

    void onEntryStarted();

    void onPropertyCreated(VCardProperty vCardProperty);

    void onVCardEnded();

    void onVCardStarted();
}
