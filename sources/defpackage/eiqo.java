package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eiqo {
    CONFIG_DEFAULT(eioq.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT),
    CONFIG_ACCOUNT(eioq.CONFIG_PROGRESS_ILLUSTRATION_ACCOUNT),
    CONFIG_CONNECTION(eioq.CONFIG_PROGRESS_ILLUSTRATION_CONNECTION),
    CONFIG_UPDATE(eioq.CONFIG_PROGRESS_ILLUSTRATION_UPDATE);

    eiqo(eioq eioqVar) {
        if (eioqVar.bA != 8) {
            throw new IllegalArgumentException("Illustration progress only allow illustration resource");
        }
    }
}
