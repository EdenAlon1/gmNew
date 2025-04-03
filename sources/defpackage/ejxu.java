package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxu extends IllegalStateException {
    public ejxu() {
        super("Calls to subscribe() should only be made by user action, from callbacks like click handlers. To set up a \"first load\" for a LocalDataSource subscription, use the `register()` overload that accepts an `initialLocalDataSource parameter. The `initialLocalDataSource` will be loaded from when the Lifecycle reaches STARTED for the first time.");
    }
}
