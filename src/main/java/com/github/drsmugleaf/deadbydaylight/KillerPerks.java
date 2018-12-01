package com.github.drsmugleaf.deadbydaylight;

import javax.annotation.Nonnull;

/**
 * Created by DrSmugleaf on 06/11/2018
 */
public enum KillerPerks implements IPerk {

    A_NURSES_CALLING("A Nurse's Calling", Killers.NURSE, "Unlocks potential in one's Aura-reading ability.\nThe Auras  of Survivors who are healing or being healed are revealed to you when they are within 20/24/28 metres of range.\n\"Still attached to the fragments of her past life, she is drawn to those in need of help.\"\nUnique to The Nurse until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    AGITATION("Agitation", Killers.TRAPPER, "You get excited in anticipation of hooking your prey.\nIncreases your movement speed while transporting bodies by 6/12/18 %. While transporting a body, your Terror Radius is increased by 6/8/12 metres.\n\"At some point, the excitement of hooking one of us becomes more important than the desire to kill us.\"\nUnique to The Trapper until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    BAMBOOZLE("Bamboozle", Killers.CLOWN, "Your vault speed is 5/10/15 % faster.\nPerforming a vault action calls upon The Entity  to block that vault location for 8/12/16 seconds.\nOnly 1 vault location may be blocked in this way at any given time. The vault location is blocked only for Survivors.\nUnique to The Clown until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    BARBECUE_AND_CHILLI("Barbecue & Chilli", Killers.CANNIBAL, "A deep bond with The Entity  unlocks potential in one's Aura-reading ability.\nAfter hooking a Survivor, all other Survivors' Auras  are revealed to you for 4 seconds when they are farther than 52/46/40 metres from the Hook .\n  Each time a Survivor is hooked for the first time, gain a 15/20/25 % stackable bonus to all Bloodpoint gains. The bonus Bloodpoints are only awarded post-trial.\n\"I just can't take no pleasure in killing. There's just some things you gotta do. Don't mean you have to like it.\" — Drayton Sawyer\nUnique to The Cannibal until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    BEAST_OF_PREY("Beast Of Prey", Killers.HUNTRESS, "Your lust for a kill is so intense that your connection with the Entity  is momentarily lost, making you totally unpredictable.\nThe Red Stain disappears after gaining Bloodlust Tier I and stays hidden until you lose Bloodlust .\nGain 30/40/50 % more Bloodpoints  for actions in the Hunter Category.\n\"Where did she go?\"\nUnique to The Huntress until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    BITTER_MURMUR("Bitter Murmur", Killers.ALL, "Unlocks potential in one's Aura-reading ability.\nEach time a Generator  is fully repaired, Survivors within 16 metres of the completed Generator will be revealed for 5 seconds.\nWhen the last Generator is fully repaired, all the Survivors' Auras  are revealed for 5/7/10 seconds."),
    BLOOD_WARDEN("Blood Warden", Killers.NIGHTMARE, "As soon as the Exit Gate  is opened, Blood Warden is activated. The Auras  of any Survivors located within Exit areas are revealed to you.\nOnce per trial, hooking a Survivor while Blood Warden is active calls upon The Entity  to block both Exits for all Survivors for 30/40/60 seconds.\n\"This is my world. And you can't ever leave.\" — Freddy Krueger\nUnique to The Nightmare until Level 40, at which point its Teachable version can then be learned and taught to the other Killers"),
    BLOODHOUND("Bloodhound", Killers.WRAITH, "Like a hunting scent hound, you smell traces of blood at a great distance.\nFresh Blood Stains are considerably more discernible than normal and can be tracked for 2/3/4 seconds longer than normal.\n\"Pebbles shimmering in the moonlight; my life drips down in a trail so easy to follow.\"\nUnique to The Wraith until Level 35, at which point its Teachable version can then be learned and taught to the other Killers"),
    BRUTAL_STRENGTH("Brutal Strength", Killers.TRAPPER, "Your great strength allows you to shred through your prey's defences.\nDestroy dropped Pallets  and damage Generators  10/15/20 % faster.\n\"It's more than muscles. A dark power motivates the beast.\"\nUnique to The Trapper until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    COULROPHOBIA("Coulrophobia", Killers.CLOWN, "Your presence alone instils great fear.\nSurvivors within your Terror Radius have a 30/40/50 % penalty to the Healing progression speed.\nUnique to The Clown until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    DEERSTALKER("Deerstalker", Killers.ALL, "Unlocks potential in one's Aura-reading ability.\nReveals dying Survivors' Auras  when standing within 12/24/36 metres."),
    DISTRESSING("Distressing", Killers.ALL, "Your horrifying emanation strikes at a supernaturally long distance.\nYour Terror Radius is increased by 22/24/26 %.\nGain 50/75/100 % more Bloodpoints  for actions in the Deviousness Category.\nThe Bonus Bloodpoints are only awarded during the trial.\n\"Bask in their fear.\""),
    DYING_LIGHT("Dying Light", Killers.SHAPE, "You become obsessed with one Survivor.\nYour Obsession's altruistic action speed is increased by 38/44/50 %.\nOnce the Obsession is killed or sacrificed, every other Survivor gets a penalty of 19/22/25 % to Repair, Healing and Sabotage speed.\nOnly one Obsession per trial.\n\"This isn't a man...\" — Dr. Sam Loomis\nUnique to The Shape until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    ENDURING("Enduring", Killers.HILLBILLY, "You are resilient to pain.\nYour rate of recovery from stuns is increased by 50/60/75 %.\n\"He stops at nothing.\"\nUnique to The Hillbilly until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    FIRE_UP("Fire Up", Killers.NIGHTMARE, "The increased pressure of losing your preys fills you with anger and gives you unsuspected motivation.\nEach time the Survivors complete repairs on a Generator , Fire Up grows in power and grants a speed bonus to pick up, drop, Pallet break, Generator damage and vaults.\n  2 Tokens: receive 6/8/10 % action speed bonus. 3 Tokens: receive 8/10/12 % action speed bonus. 4 Tokens: receive 10/12/14 % action speed bonus. \"Now why don't you just fucking die?\" — Freddy Krueger\nUnique to The Nightmare until Level 30, at which point its Teachable version can then be learned and taught to the other Killers"),
    FRANKLINS_DEMISE("Franklin's Demise", Killers.CANNIBAL, "Your vicious attacks make the Survivors drop their Item  on impact.\nThe lost Item is damaged in the fall, losing 0/5/10 % of its base amount of charges.\n\"Sally, I hear something. Stop! Stop!\" — Franklin Hardesty\nUnique to The Cannibal until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    HANGMANS_TRICK("Hangman's Trick", Killers.PIG, "Your ingenious modifications to Hooks  prevent tampering and permanent damage.\nHooks destroyed by sabotage or sacrifices repair automatically after 30/20/10 seconds.\nGain a notification when someone starts sabotaging the Hooks.\nThe automatic repair timer of sabotaged Bear Traps  is reduced by 60 seconds.\n\"No excuses, no equivocations... No crying.\" — Amanda Young\nUnique to The Pig until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    HEX_DEVOUR_HOPE("Hex: Devour Hope", Killers.HAG, "A Hex rooting its power on hope. The false hope of Survivors ignites your hunger.\nWhen a Survivor is rescued from a Hook at least 24 metres away, Devour Hope receives a Token.\n  2 Tokens: ―/―/gain a 5 % Haste Status Effect, 10 seconds after hooking a Survivor, for a duration of 10 seconds. 3 Tokens: ―/Survivors suffer from the Exposed Status Effect./Survivors suffer from the Exposed Status Effect. 5 Tokens: grants the ability to kill Survivors by your own hand./grants the ability to kill Survivors by your own hand./grants the ability to kill Survivors by your own hand. The Hex effects persist as long as the related Hex Totem is standing.\n\"If you do nothing, you have their blood on your hands. If you save them, her hunger grows.\"\nUnique to The Hag until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    HEX_HAUNTED_GROUND("Hex: Haunted Ground", Killers.SPIRIT, "Two trapped Hex Totems will spawn in the Trial.\nWhen one of the two trapped Hex Totems is cleansed by a Survivor , all Survivors suffer from the Exposed  Status Effect for 40/50/60 seconds.\nThe remaining trapped Hex Totem immediately becomes a Dull Totem.\n\"Her home became profane.\"\nUnique to The Spirit until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    HEX_HUNTRESS_LULLABY("Hex: Huntress Lullaby", Killers.HUNTRESS, "A Hex rooting its power in despair. Your hunt is an irresistible song of dread which muddles your prey's attention.\nSurvivors receive a 2/4/6 % regression penalty when missing any Skill Check .\nEach time a Survivor is hooked, Huntress Lullaby grows in power:\n  1 to 4 Tokens: Time between the Skill Check warning sound and the Skill Check becomes shorter. 5 Tokens: No Skill Check warning. The Hex effects persist as long as the related Hex Totem is standing.\n\"That song, it drives me crazy!\"\nUnique to The Huntress until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    HEX_NO_ONE_ESCAPES_DEATH("Hex: No One Escapes Death", Killers.ALL, "A Hex rooting its power on hope. You are animated by the power of your Hex Totem when the Survivors are on the verge of escaping.\nOnce the Exit Gates  are powered, if there is a Dull Totem remaining on the Map, this Hex is applied to it.\nWhile this Hex is active, Survivors suffer from the Exposed  Status Effect and your movement speed is increased by 2/3/4 %.\nThe Hex effects persist as long as the related Hex Totem is standing.\n\"And the beast became faster and more powerful as if the Entity's shadowy whips were lashing at its back.\""),
    HEX_RUIN("Hex: Ruin", Killers.HAG, "A Hex that affects the Survivors' skills at repairing Generators .\n2/3/4 Survivors are affected by Ruin, which causes the following:\n  Good Skill Checks result in 5 % regression on the Generator Great Skill Checks grant 0 % bonus progression on the Generator. The Hex effects persist as long as the related Hex Totem is standing.\n\"A curse is upon you. It will cause your ruin.\"\nUnique to The Hag until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    HEX_THE_THIRD_SEAL("Hex: The Third Seal", Killers.HAG, "A Hex that hinders one's Aura-reading ability.\nHitting a Survivor while the Hex Totem is active applies the Blindness  Status Effect.\nThis effect applies to the last 2/3/4 Survivors hit.\nThe Hex effects persist as long as the related Hex Totem is standing.\n\"She touched your skin, you bear the witch's mark!\"\nUnique to The Hag until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    HEX_THRILL_OF_THE_HUNT("Hex: Thrill Of The Hunt", Killers.ALL, "A Hex rooting its power on hope. The false hope of Survivors  fills you with excitement and strengthens your totems.\nFor each Dull Totem and Hex Totem remaining on the Map gain a Token.\n  Gain 6/8/10 % more Bloodpoints for actions in the Hunter Category for each Token. Survivors' cleansing speed is reduced by 4/5/6 % for each Token. Gain a notification when someone starts working on a Hex Totem. The Hex effects persist as long as the related Hex Totem is standing."),
    INSIDIOUS("Insidious", Killers.ALL, "Unlocks the stealth ability.\nBy standing still for 4/3/2 seconds, you reduce your Terror Radius to 0 metres and thus become stealthy until you move or act again."),
    IRON_GRASP("Iron Grasp", Killers.ALL, "Your powerful hold onto the Survivors causes escapes to be nearly impossible.\nEffects of Survivor struggling are reduced by 25/50/75 %.\nTime to struggle out of your grasp is increased by 4/8/12 %."),
    KNOCK_OUT("Knock Out", Killers.CANNIBAL, "The trauma caused by your brutal attacks makes crying for help painfully difficult.\nDying Survivors' Auras  are not revealed to other Survivors when they are standing outside of 32/24/16 metres of range.\n\"Oh, that gun's no good. The old way... with a sledge! You see, that way's better. They die better that way.\" — Nubbins Sawyer\nUnique to The Cannibal until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    LIGHTBORN("Lightborn", Killers.HILLBILLY, "Unlike other beasts of The Fog, you have adapted to light.\nResistance to blindness is increased by 20/40/60 %. Recovery from blindness is increased by 50 %.\n\"These monsters... they adapt! They emerge with strange new abilities.\" — Vigo, Vigo's Journal\nUnique to The Hillbilly until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    MAKE_YOUR_CHOICE("Make Your Choice", Killers.PIG, "When a Survivor rescues another from a Hook  at least 32 metres away from you, Make Your Choice triggers and applies the Exposed  Status Effect on the rescuer for 40/50/60 seconds.\nMake Your Choice has a cool-down of 60 seconds.\n\"You'd be surprised what tools can save a life.\" — Amanda Young\nUnique to The Pig until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    MONITOR_AND_ABUSE("Monitor & Abuse", Killers.DOCTOR, "Meticulous in your approach, terrifying in your application.\nWhile in a Chase, your Terror Radius is increased by 6/7/8 metres.\nOtherwise your Terror Radius is decreased by 6/7/8 metres and your Field Of View is slightly/moderately/considerably increased.\nField Of View gains do not stack.\n\"It's time for your treatment!.\" — Herman Carter, The Doctor\nUnique to The Doctor until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    MONSTROUS_SHRINE("Monstrous Shrine", Killers.ALL, "Your fervent care of the Hooks found in the Basement  has aroused the Entity 's interest.\nThe Basement Hooks are granted the following bonuses:\n  3/6/9 % faster Entity progression. 5/10/15 % increased difficulty on escape attempts. 3/6/9 % increased penalty to escape fails. \"Then you will know that there is no escape. When hanging in the depths, you face the dark one.\""),
    OVERCHARGE("Overcharge", Killers.DOCTOR, "You are fuelled by your hate for progress.\nOvercharge a Generator  by performing the Damage Generator action.\nThe next Survivor interacting with that Generator is faced with a moderately/considerably/tremendously difficult Skill Check .\nFailing the Skill Check results in an additional 3/4/5 % Generator regression. Succeeding the Skill Check grants no progress but prevents the Generator explosion.\n\"It is a trap. But a trap one must step in...\"\nUnique to The Doctor until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    OVERWHELMING_PRESENCE("Overwhelming Presence", Killers.DOCTOR, "Your presence alone instils great fear. Survivors within your Terror Radius suffer from inefficiency.\nAffected Survivors' Item  consumption rates are increased by 80/90/100 %.\n\"Shit!! I dropped the gauze!\"\nUnique to The Doctor until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    PLAY_WITH_YOUR_FOOD("Play With Your Food", Killers.SHAPE, "You become obsessed with one Survivor.\nEvery time you chase your Obsession and let them escape, you receive a Token up to a maximum of 3 Tokens.\nEach Token increases your movement speed by 3/4/5 %.\nEach offensive action spends one Token.\nOnly one Obsession per trial.\n\"You've fooled them, haven't you Michael? But not me.\" — Dr. Sam Loomis\nUnique to The Shape until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    POP_GOES_THE_WEASEL("Pop Goes The Weasel", Killers.CLOWN, "A deep bond with The Entity  unlocks great strength.\nAfter hooking a Survivor, the next Generator  you break is instantly regressed by 15/20/25 % of its total progression. Normal Generator regression applies after the damage is done.\nPop Goes The Weasel is active for 30 seconds after the Survivor is hooked.\nUnique to The Clown until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    PREDATOR("Predator", Killers.WRAITH, "Your acute tracking ability allows you to hone in on disturbances left by running Survivors.\nScratch Marks left by Survivors will spawn slightly/moderately/considerably closer together.\n\"Never stop moving and hope you're always two steps ahead of the beast.\" — Unknown, Notebook\nUnique to The Wraith until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    RANCOR("Rancor", Killers.SPIRIT, "You become obsessed with one Survivor.\nEach time a Generator  is completed, the Obsession sees your Aura  for 5/4/3 seconds.\nEach time a Generator is completed, all Survivors' locations are revealed to you for 3 seconds.\nOnce all Generators are completed, the Obsession has the Exposed  Status Effect and the Killer can kill the Obsession.\nOnly one Obsession per trial.\nUnique to The Spirit until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    REMEMBER_ME("Remember Me", Killers.NIGHTMARE, "You become obsessed with one Survivor.\nEach time you hit your Obsession, you increase the opening time of the Exit Gates  by 5 seconds up to a maximum of 20 additional/25 additional/30 additional seconds.\nThe Obsession is not affected by Remember Me.\nOnly one Obsession per trial.\n\"You don't remember? You must. You're my number one, and you'll never wake up again.\" — Freddy Krueger\nUnique to The Nightmare until Level 35, at which point its Teachable version can then be learned and taught to the other Killers"),
    SAVE_THE_BEST_FOR_LAST("Save The Best For Last", Killers.SHAPE, "You become obsessed with one Survivor.\nEarn a Token for each successful hit that is not dealt to the Obsession.\nEach Token grants a stackable 5 % decreased cool-down on successful attacks. You can earn up to 8 Tokens.\nAttacking your Obsession will make you lose 4/3/2 Tokens. You can no longer gain Tokens if your Obsession is sacrificed or killed.\nOnly one Obsession per trial.\n\"Death has come to your little town, Sheriff.\" — Dr. Sam Loomis\nUnique to The Shape until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    SHADOWBORN("Shadowborn", Killers.WRAITH, "You have a keen vision in the darkness of the night.\nYour Field Of View is moderately/considerably/tremendously wider than normal.\nField Of View gains do not stack.\n\"Shining in the darkest dark, his eyes pierce the night and sting your soul.\"\nUnique to The Wraith until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    SLOPPY_BUTCHER("Sloppy Butcher", Killers.ALL, "You know where to hit to make them bleed.\nWounds inflicted by successful attacks slightly/moderately/considerably increase the Survivor's bleeding frequency and cause the Mangled Status Effect.\nHemorrhage  and Mangled  effects caused by Sloppy Butcher return to normal once the Survivor is fully healed.\n\"It's in its sadistic nature. There is no swift kill as it delights in the obscene spectacle of our agonizing suffering.\""),
    SPIES_FROM_THE_SHADOWS("Spies From The Shadows", Killers.ALL, "The Crows  found in the world can communicate directly with you.\n50/50/75 % of the time, cawing Crows give you a visual cue when you are within a 16/24/36 metres.\n\"In the shadows they torment, scarring our minds with each scream.\""),
    SPIRIT_FURY("Spirit Fury", Killers.SPIRIT, "Each Pallet  you break magnifies the wrath of The Entity .\nAfter breaking 4/3/2 Pallets, the next time you are stunned by a Pallet, The Entity will instantly break it. You still suffer from the stun effect penalty.\n\"Fury is her blood.\"\nUnique to The Spirit until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    STRIDOR("Stridor", Killers.NURSE, "You are acutely sensitive to the breathing of your prey.\nBreathing of Survivors in pain is 25/50/50 % louder and regular breathing is 0/0/25 % louder.\n\"If you don't stop and catch your breath... she will.\"\nUnique to The Nurse until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    SURVEILLANCE("Surveillance", Killers.PIG, "Unlocks potential in one's Aura-reading ability.\nThe last 1 regressing Generator's/2 regressing Generators'/3 regressing Generators' Aura(s) are indicated in white to you for 16 seconds.\n\"Are you gonna behave?\" — Amanda Young\nUnique to The Pig until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    TERRITORIAL_IMPERATIVE("Territorial Imperative", Killers.HUNTRESS, "Unlocks potential in one's Aura-reading ability.\nSurvivors' Auras  are revealed to you for 3 seconds when they enter the Basement  and you are more than 32 metres away from the Basement entrance.\nTerritorial Imperative can only be triggered once every 60/45/30 seconds.\n\"We're not safe anywhere...\"\nUnique to The Huntress until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    THANATOPHOBIA("Thanatophobia", Killers.NURSE, "Their courage fades in the face of their undeniable mortality.\nAll Survivors receive penalties to Repair, Healing and Sabotage speeds for each Injured , Dying  or hooked Survivor.\n  1 Injured, Dying or hooked Survivor: 4/5/6 % reduced action speed. 2 Injured, Dying or hooked Survivors: 7/8/9 % reduced action speed. 3 Injured, Dying or hooked Survivors: 10/11/12 % reduced action speed. 4 Injured, Dying or hooked Survivors: 13/14/15 % reduced action speed. \"She plays with us and revels in our pain.\"\nUnique to The Nurse until Level 35, at which point its Teachable version can then be learned and taught to the other Killers."),
    TINKERER("Tinkerer", Killers.HILLBILLY, "When a Generator  is repaired at 85 %, you receive a noise notification and your Terror Radius is reduced to 0 metres for 8/10/12 seconds.\nUnique to The Hillbilly until Level 40, at which point its Teachable version can then be learned and taught to the other Killers."),
    UNNERVING_PRESENCE("Unnerving Presence", Killers.TRAPPER, "Your presence alone instils great fear.\nSurvivors within your Terror Radius have a 6/8/10 % greater chance of triggering Skill Checks  when repairing, healing or sabotaging.\nTriggered Skill Checks' success zones are reduced by 40/50/60 %.\n\"Its presence befalls us.\"\nUnique to The Trapper until Level 30, at which point its Teachable version can then be learned and taught to the other Killers."),
    UNRELENTING("Unrelenting", Killers.ALL, "You recuperate faster from missed attacks made with your main weapon.\nThe cool-down of missed attacks is reduced by 20/25/30 %."),
    WHISPERS("Whispers", Killers.ALL, "You have a rudimentary understanding of the Entity 's voice.\nSporadically hear the Entity's Whisper when standing within a 48/40/32 metres of a Survivor.\n\"It's unclear as to the motivations of the fog, but it is undeniable that it often takes the beast's side.\" — Unknown, Notebook");

    @Nonnull
    public final String NAME;

    @Nonnull
    public final Killers KILLER;

    @Nonnull
    public final String DESCRIPTION;

    KillerPerks(@Nonnull String name, @Nonnull Killers killer, @Nonnull String description) {
        NAME = name;
        KILLER = killer;
        DESCRIPTION = description;
    }

    @Nonnull
    public static KillerPerks from(@Nonnull String name) {
        for (KillerPerks perk : values()) {
            if (perk.NAME.equalsIgnoreCase(name)) {
                return perk;
            }
        }

        throw new IllegalArgumentException("No killer perk exists with name " + name);
    }

    @Nonnull
    @Override
    public String getName() {
        return NAME;
    }

    @Nonnull
    public Killers getKiller() {
        return KILLER;
    }

    @Nonnull
    public String getDescription() {
        return DESCRIPTION;
    }

}