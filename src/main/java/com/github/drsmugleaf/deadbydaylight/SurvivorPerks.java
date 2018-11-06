package com.github.drsmugleaf.deadbydaylight;

import javax.annotation.Nonnull;

/**
 * Created by DrSmugleaf on 05/11/2018
 */
public enum SurvivorPerks {

    ACE_IN_THE_HOLE("Ace In The Hole", Survivors.ACE_VISCONTI, "Lady Luck always seems to be throwing something good your way. When retrieving an Item  from a Chest , there is a 100 % chance that an Add-on  of Very Rare Rarity or lower will be attached to it. 10/25/50 % chance to find a second Add-on of Uncommon Rarity or lower. \"Everything that glitters isn't gold. But gold isn't worth a damn in this place, so this should come in handy.\" — Ace Visconti Unique to Ace Visconti‎‎ until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    ADRENALINE("Adrenaline", Survivors.MEG_THOMAS, "You are fuelled by unexpected energy when on the verge of escape. Instantly heal one Health State and sprint at 150 % of your normal running speed for 5 seconds when the Exit Gates  are powered. Adrenaline is on hold if you are disabled at the moment it should take effect and will activate when freed. Adrenaline will wake you up if you are asleep when it triggers. Adrenaline ignores Exhaustion. Causes Exhaustion  for 60/50/40 seconds. You do not recover from Exhaustion when running. Unique to Meg Thomas until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    ALERT("Alert", Survivors.FENG_MIN, "Your acute senses are on high alert. When the Killer performs a break action, their Aura  is revealed to you for 3/4/5 seconds. \"I have true sight.\" — Feng Min Unique to Feng Min until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    AUTODIDACT("Autodidact", Survivors.ADAM_FRANCIS, "You start the Trial with a -25 % progression penalty for Skill Checks  to heal Survivors . For every successful Skill Check completed while healing a Survivor, you receive a Token for a maximum of 3/4/5 Tokens. Each Token grants you a +15 % bonus progression for a successful Skill Check while healing Survivors. Great Skill Checks cannot be performed while using Autodidact. Autodidact is not active when using a Med-Kit  to heal. \"There's no limit to what you can achieve, as long as you back it up with hard work.\" — Adam Francis Unique to Adam Francis until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    BALANCED_LANDING("Balanced Landing", Survivors.NEA_KARLSSON, "Your agility is incomparable. Cat-like reflexes reduce your stagger duration from falls by 75 %. Upon landing, start sprinting at 150 % of your normal running speed for a maximum of 3 seconds if not exhausted. Causes Exhaustion  for 60/50/40 seconds. You do not recover from Exhaustion while running. \"I've jumped from higher places.\" — Nea Karlsson Unique to Nea Karlsson until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    BOIL_OVER("Boil Over", Survivors.KATE_DENSON, "You are a battler and do everything to escape a foe's grasp. Your struggling effects on the Killer are increased by 25/50/75 %. You obscure the Killer's ability to see Hook Auras  within 10/12/14 metres. \"Buck and Wild, Swing to be free, Your hands just can't keep ahold of me.\" — Kate Denson's \"Boil Over\" Unique to Kate Denson until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    BOND("Bond", Survivors.DWIGHT_FAIRFIELD, "Unlocks potential in one's Aura-reading ability. Allies' Auras  are revealed to you when they are within 20/28/36 metres of range. \"We have to work as a team, I need you to survive so that I can survive!\" — Dwight Fairfield Unique to Dwight Fairfield until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    BORROWED_TIME("Borrowed Time", Survivors.BILL_OVERBECK, "You are fuelled with an unexpected energy when saving an Ally from a Hook within the Killer's Terror Radius. After unhooking a Survivor within the Killer's Terror Radius, for 15 seconds, any damage taken that would put the unhooked Survivor into the Dying State will instead trigger a 15/20/25 seconds bleed-out timer. If the unhooked Survivor takes any damage during the bleed-out timer or if the bleed-out timer ends, the unhooked Survivors will be put into the Dying State . \"Probably stings like hell, but it ain't gonna kill ya. Up and at 'em soldier. Time to move!\" — Bill Overbeck Unique to William \"Bill\" Overbeck until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    BOTANY_KNOWLEDGE("Botany Knowledge", Survivors.CLAUDETTE_MOREL, "You transform plants found around The Campfire into tinctures that slow down bleeding. Healing Speed and Healing Item Efficiency is increased by 11/22/33 %. \"Basic botany knowledge could save your life someday.\" — Claudette Morel Unique to Claudette Morel until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    CALM_SPIRIT("Calm Spirit", Survivors.JAKE_PARK, "Animals seem to trust you as they often stay calm in your presence. Reduces chances of alerting Crows  by 80/90/100 %. Your calm spirit can overcome the urge to scream due to Madness, Intoxication or getting injured by the Killer. Unique to Jake Park until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    DANCE_WITH_ME("Dance With Me", Survivors.KATE_DENSON, "When performing a fast vault or leaving a Locker  in a sprint, you leave no Scratch Marks for 3 seconds. Dance With Me has a cool-down of 60/50/40 seconds. \"Another show's off and runnin', Dance with me, cuz there's a storm a commin' Follow my boots, try to keep up, Dance with me, until sun up.\" — Kate Denson's \"Dance With Me\" Unique to Kate Denson until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    DARK_SENSE("Dark Sense", Survivors.ALL, "Unlocks potential in one's Aura-reading abilities. Each time you complete a Generator , the Killer's Aura is revealed to you for 5 seconds. When the last Generator is powered, the Killer's Aura is revealed to you for 5/7/10 seconds. \"Take it from an old-timer: Slow down, don't rush and try not to worry so much! The best way to beat him is to know how he thinks.\" — Murf, The Lost Tapes"),
    DEAD_HARD("Dead Hard", Survivors.DAVID_KING, "Activate-able Perk. You can take a beating. When Injured, tap into your adrenaline bank and dash forward quickly to avoid damage.   Press the Active Ability button while running to dash forward. During the dash, you avoid damage. Causes Exhaustion  for 60/50/40 seconds. You do not recover from Exhaustion while running. \"We were walkin' through t'ginnel one night when a beer bottle flew past me, then another, and another. I thought to myself \"Gonna 'ave some fun 'ere lads, let's get stuck in!' \". It were a right dust up, I swear down!\" — David King Unique to David King until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    DECISIVE_STRIKE("Decisive Strike", Survivors.LAURIE_STRODE, "Using whatever is at hand, you stab at your aggressor in an ultimate attempt to escape. If you are the Obsession, once per trial, when grabbed by the Killer, succeed a Skill Check  to automatically escape the Killer's grasp and stun them for 3/3½/4 seconds. If you are not the Obsession, once per trial, while in the Killer's grasp, once the wiggle meter has reached 45/40/35 %, succeed a Skill Check to automatically fill the rest of the wiggle meter and escape from the Killer's grasp. Increases your chance to be the Killer's Obsession. Only one Obsession per trial. \"There's nothing to be scared of.\" — Laurie Strode Unique to Laurie Strode until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    DEJA_VU("Déjà Vu", Survivors.ALL, "Unlocks potential in one's Aura-reading ability. Paranoia paired with your horror of failure helps prepare you from repeating the same mistakes. The Auras of 3 Generators  in closest proximity to each other are revealed to you for 30/45/60 seconds, at the start of the trial and each time a Generator is completed. If you are holding a Map  that can track Objectives, Generators revealed by Déjà Vu are added to the Map."),
    DELIVERANCE("Deliverance", Survivors.ADAM_FRANCIS, "After performing a Safe Hook Rescue on another Survivor, the Perk activates. You now have a 100 % chance to unhook yourself during the escape attempt. A successful Deliverance from the Hook  triggers the Broken  Status Effect for 100/80/60 seconds. \"I was raised by a strict man who taught me how to make the best of a bad situation.\" — Adam Francis Unique to Adam Francis until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    DETECTIVES_HUNCH("Detective's Hunch", Survivors.DAVID_TAPP, "Unlocks potential in one's Aura-reading ability. When completing a Generator, the Auras  of Generators , Chests  and Totems  within 32/48/64 metres are revealed to you for 5 seconds. If you are holding a Map  that can track Objectives, Generators revealed by Detective's Hunch are added to the Map. \"Are you able to tell us where you were last night?\" — Detective David Tapp Unique to David Tapp until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    DIVERSION("Diversion", Survivors.ADAM_FRANCIS, "Activate-able Perk. Standing within the Killer's Terror Radius while not in a Chase for 45 seconds activates the Perk.   Once the Perk is activated, press the Active Ability button while crouched and motionless to throw a pebble, which creates a loud noise notification for the Killer at a distance of 10/15/20 metres. The Perk deactivates once it has been used. \"There's what is easy and then there's what is right. If you confuse the two, there's no telling what you become.\" — Adam Francis Unique to Adam Francis until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    EMPATHY("Empathy", Survivors.CLAUDETTE_MOREL, "Unlocks potential in one's Aura-reading ability. Dying  or Injured  Allies' Auras  are revealed to you when within 32/64/∞ metres of range. Empathy does not reveal Auras of Allies when they are in the Killer's direct contact. Unique to Claudette Morel until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    HOPE("Hope", Survivors.ALL, "The growing odds of a successful escape fill you with hope and give you wings. As soon as the Exit Gates  are powered, you gain a 5/6/7 % Haste  Status Effect for 120 seconds. \"Buckle up, fuckos! Let's roll.\" — Nikki, The Lost Tapes"),
    IRON_WILL("Iron Will", Survivors.JAKE_PARK, "You're able to concentrate and enter a meditative-like state to numb some pain. Grunts of pain caused by injuries are reduced by 50/75/100 %. Unique to Jake Park until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    KINDRED("Kindred", Survivors.ALL, "Unlocks potential in one's Aura-reading ability. While you're on the Hook, 1 random Survivor's/All Survivors'/All Survivors' and the Killer's (in an 8m radius around the Hook) Aura(s) are revealed to all other Survivors. Kindred trumps any of the Killer's stealth abilities. \"Be kind to one another. We're all in this together.\" — Sujan, The Lost Tapes"),
    LEADER("Leader", Survivors.DWIGHT_FAIRFIELD, "You're able to organise a team to cooperate more efficiently. Increases the other Survivors' speed at repairing, healing, sabotaging, cleansing, opening Exit Gates and searching Chests by 3/6/9 % when they are within 8 metres of range from you. Once out of range, this effect persists for 15 seconds. \"Listen to me if you don't wanna end up on a hook.\" — Dwight Fairfield Unique to Dwight Fairfield until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    LEFT_BEHIND("Left Behind", Survivors.BILL_OVERBECK, "You'll get the job done... No matter the cost. If you are the last Survivor remaining in the trial, for each Generator  that needs to be completeed, gain a 19/22/25 % bonus to Repair speed. \"I'm not horseshittin' around. I'm doing this alone!\" — Bill Overbeck Unique to William \"Bill\" Overbeck until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    LIGHTWEIGHT("Lightweight", Survivors.ALL, "Your running is light and soft, making your tracks harder to follow. Scratch Marks stay visible 1/2/3 seconds less than normal. \"Take it slow, he knows where you've been... just like I've always said: 'live slow and die old'\" — Dylan, The Lost Tapes"),
    LITHE("Lithe", Survivors.FENG_MIN, "After performing a vault, break into a sprint at 150 % of your normal running speed for a maximum of 3 seconds. Activates in Chases only. Causes Exhaustion  for 60/50/40 seconds. You do not recover from Exhaustion while running. \"U mad?\" — Feng Min Unique to Feng Min until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    NO_MITHER("No Mither", Survivors.DAVID_KING, "You are affected by the Broken  Status Effect for the duration of the Trial. Your thick blood coagulates practically instantly.   You don't leave pools of Blood . Grunts of pain caused by injuries are reduced by 0/25/50 % at any time. Grants the ability to fully recover from the Dying State .  \"I lost it. Just lamped him one.. They went and banned me didn't they.. Went t'pub afterwards, had a few pints and moved on to the next chapter. I couldn't be mithered with it all anyway, you know what I mean? Can't be arsed.\" — David King Unique to David King until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    NO_ONE_LEFT_BEHIND("No One Left Behind", Survivors.ALL, "It is inconceivable to leave someone behind. Once the Exit Gates  are powered, gain 50/75/100 % more Bloodpoints  for actions in the Altruism Category and perform them 4/8/12 % quicker. \"... yeah, no shit. But I believe we can outsmart and overthrow him if we work together. Don't be predictable and selfish!\" — Clyde, The Lost Tapes"),
    OBJECT_OF_OBSESSION("Object Of Obsession", Survivors.LAURIE_STRODE, "A supernatural bond links you to the Killer. If you are looking in the Killer's direction, your link will reveal your Auras  to each other. This effect applies only if you are outside of the Killer's Terror Radius. As the Killer's Obsession, this effect applies to a maximum range of 56/64/72 metres. Otherwise, it applies to a maximum range of 44/56/64 metres. Increases your chance to be the Killer's Obsession. Only one Obsession per trial. \"He was watching me!\" — Laurie Strode Unique to Laurie Strode until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    OPEN_HANDED("Open-Handed", Survivors.ACE_VISCONTI, "Strengthens the potential of you and your team's Aura-reading abilities. Increases Aura reading ranges by 4/6/8 metres. \"Paying attention is what kept me alive through the years. That, and my good looks of course.\" — Ace Visconti Unique to Ace Visconti‎‎ until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    PHARMACY("Pharmacy", Survivors.QUENTIN_SMITH, "You have a knack for finding medicine. Searches through Chests  are 40/60/80 % faster and the noises they cause along with their hearing distances are reduced by 0/4/8 metres. Pharmacy guarantees an Emergency Med-Kit  on your first completed Chest search. \"Adrenaline, it's going to keep us awake. I stole it from one of the Nurse's carts.\" — Quentin Smith Unique to Quentin Smith until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    PLUNDERERS_INSTINCT("Plunderer's Instinct", Survivors.ALL, "Unlocks potential in one's Aura-reading ability. The Auras  of Chests  are revealed to you when standing within 16/24/32 metres of range. Grants a slightly/moderately/considerably better chance at finding an Item  of a higher Rarity from Chests. \"The pioneers used to loot these babies for hours.\" — Aizeyu, The Lost Tapes"),
    PREMONITION("Premonition", Survivors.ALL, "You have the undeniable capability to sense danger. Get an auditory warning when looking in the direction of the Killer in a 45° cone within a range of 12/24/36 metres. Premonition has a cool-down of 60/45/30 seconds each time it activates. Premonition trumps any of the Killer's stealth abilities. \"I have a bad feeling about this!\""),
    PROVE_THYSELF("Prove Thyself", Survivors.DWIGHT_FAIRFIELD, "Receive an incremental speed bonus to repairing, healing, sabotaging, cleansing, opening Exit Gates and searching Chests when other Survivors are within 8 metres of range.   1 nearby Survivor grants 1/2/3 % increased speed. 2 nearby Survivor grant 2/4/6 % increased speed. 3 nearby Survivor grant 3/6/9 % increased speed. \"I'll show you what I can do!\" — Dwight Fairfield Unique to Dwight Fairfield until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    QUICK_AND_QUIET("Quick & Quiet", Survivors.MEG_THOMAS, "You do not make as much noise as others when quickly vaulting over obstacles or hiding in Lockers . The vault and hide actions' noise detection and audio range is reduced by 100 %. This effect can only be triggered once every 30/25/20 seconds. Unique to Meg Thomas until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    RESILIENCE("Resilience", Survivors.ALL, "You are motivated in dire situations. Grants 3/6/9 % additional speed when repairing, sabotaging, healing, unhooking, vaulting, cleansing, opening Exit Gates and searching Chests while Injured . \"Focus, even in these desperate times.\""),
    SABOTEUR("Saboteur", Survivors.JAKE_PARK, "Unlocks the ability to sabotage without a Toolbox  at 50 % the normal Sabotage speed. Hooks  and Bear Traps  you sabotage stay broken for an extra 10/20/30 seconds. Unique to Jake Park until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    SELF_CARE("Self-Care", Survivors.CLAUDETTE_MOREL, "Unlocks the ability to heal yourself without a Med-Kit  at 50 % the normal Healing speed. Increases the efficiency of Med-Kit self-heal by 10/15/20 %. Unique to Claudette Morel until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    SLIPPERY_MEAT("Slippery Meat", Survivors.ALL, "You have developed an efficient way to get out of Bear Traps  and Hooks . Grants up to 1/2/3 extra escape attempts on the Hook. The odds of freeing yourself from Bear Traps are increased by 15/20/25 %."),
    SMALL_GAME("Small Game", Survivors.ALL, "You have the undeniable capability to sense danger. Get an auditory warning when looking in the direction of Killer Traps and Totems in a 45° cone within a range of 8/10/12 metres. Small Game has a cool-down of 15/12/10 seconds each time it activates. Only works on Traps that are set by Killers. \"Nope.\" — Andy, The Lost Tapes"),
    SOLE_SURVIVOR("Sole Survivor", Survivors.LAURIE_STRODE, "As more of your friends fall to the Killer, you become shrouded in isolation and the Killer's Aura-reading abilities towards you are disrupted. Your Aura  cannot be read by the Killer within a maximum range of 20/24/28 metres for each killed or sacrificed Survivor. Increases your chance to be the Killer's Obsession. Only one Obsession per trial. \"It was the boogeyman.\" — Laurie Strode Unique to Laurie Strode until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    SPINE_CHILL("Spine Chill", Survivors.ALL, "An unnatural tingle warns you of impending doom. Get notified when the Killer is looking directly in your direction and standing within 12/24/36 metres of range. When Spine Chill is active, Skill Check  trigger odds are increased by 10 % with success zones reduced by 10 % and your Repair, Heal and Sabotage speeds are increased by 2/4/6 %. \"There is a voice that doesn't use words. Listen..\" — Sassy, The Lost Tapes"),
    SPRINT_BURST("Sprint Burst", Survivors.MEG_THOMAS, "When starting to run, break into a sprint at 150 % your normal running speed for a maximum of 3 seconds. Causes Exhaustion  for 60/50/40 seconds. Sprint Burst cannot be used while Exhausted. You do not recover from Exhaustion while running. Unique to Meg Thomas until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    STAKE_OUT("Stake Out", Survivors.DAVID_TAPP, "Getting close to the Killer  fills you with determination. For each 15 seconds you are standing within the Killer's Terror Radius and are not in a Chase, you gain a Token up to a maximum of 2/3/4 Tokens. When Stake Out has at least 1 Token, Good Skill Checks  are considered Great Skill Checks and consume 1 Token. \"I had you, I had you on your knees. You're runnin' scared because we had you. We're gonna close this case!\" — Detective David Tapp Unique to David Tapp until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    STREETWISE("Streetwise", Survivors.NEA_KARLSSON, "Long nights out taught you to do a lot with what you've got. Reduce the consumption rate of Item  charges by 10/12/15 % for you and Allies within 8 metres of range. Once out of range, this effect persists for 15 seconds. \"You're doing it wrong! Let me show you how it's done.\" — Nea Karlsson Unique to Nea Karlsson until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    THIS_IS_NOT_HAPPENING("This Is Not Happening", Survivors.ALL, "You perform at your best when you are under extreme stress. Great Skill Check  success zones when repairing, healing and sabotaging get 10/20/30 % bigger when you are Injured ."),
    TECHNICIAN("Technician", Survivors.FENG_MIN, "You are apt at handling machinery with the greatest care and precision. The noises caused by your Repairs and their hearing distance are reduced by 0/4/8 metres. On a failed Repair Skill Check , there is a 30/40/50 % chance that the Generator  explosion will be prevented. \"I'm gonna stealth this one.\" — Feng Min Unique to Feng Min until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    TENACITY("Tenacity", Survivors.DAVID_TAPP, "There is nothing stopping you. Your ferocious tenacity in dire situations allows you to crawl 30/40/50 % faster and recover at the same time. \"What the hell is this? I'm taking this bastard down!\" — Detective David Tapp Unique to David Tapp until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    UP_THE_ANTE("Up The Ante", Survivors.ACE_VISCONTI, "All will be well in the end; you just know it. Your confidence strengthens the feeling of hope for those around you. For each other Survivor still alive, grant a 1/2/3 % bonus to Luck  to all remaining Survivors. \"What can I say? I'm just a very lucky guy... I'm sure some of it will rub off on you.\" — Ace Visconti Unique to Ace Visconti‎‎ until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    UNBREAKABLE("Unbreakable", Survivors.BILL_OVERBECK, "Past battles have taught you a thing or two about survival. Grants the ability to fully recover from the Dying State  once per trial. Increases the Dying State recovery speed by 15/20/25 %. \"Goddammit, I am seriously FUBAR!\" — Bill Overbeck Unique to William \"Bill\" Overbeck until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    URBAN_EVASION("Urban Evasion", Survivors.NEA_KARLSSON, "Years of evading the cops taught you a thing or two about stealth. Your movement speed while crouching is increased by 90/95/100 %. \"The paint is still fresh but I'm long gone.\" — Nea Karlsson Unique to Nea Karlsson until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors."),
    VIGIL("Vigil", Survivors.QUENTIN_SMITH, "You look over your friends even in dire situations. You and your Allies within 8 metres of range recover from Exhaustion , Hemorrhage , Mangled , Hindered and Blindness  Status Effects 10/15/20 % faster. Once out of range, this effect persists for 15 seconds. \"I'm gonna be here when you wake up. You're gonna make it.\" — Quentin Smith Unique to Quentin Smith until Level 40, at which point its Teachable version can then be learned and taught to the other Survivors."),
    WAKE_UP("Wake Up!", Survivors.QUENTIN_SMITH, "Unlocks potential in one's Aura-reading ability. Once all Generators  are powered, Exit Gates  are revealed to you when within 24/48/∞ metres of range. While opening the Exit Gates, reveal your Aura  to other Survivors within 24/48/∞ metres of range. While Wake Up! is active, you open the Exit Gates 5/10/15 % faster. \"Ok, look. If we survive the next 24 hours, then I'll take you out on a real date.\" — Quentin Smith Unique to Quentin Smith until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    WE_WILL_MAKE_IT("We'll Make It", Survivors.ALL, "Helping others heightens your morale. For each Survivor you rescue from a Hook, gain an additional 25/50/100 % speed increase to healing others, up to a maximum of 100 % for 30/60/90 seconds. \"I'm confident we can all escape in one piece if we help each other.\""),
    WE_ARE_GONNA_LIVE_FOREVER("We're Gonna Live Forever", Survivors.DAVID_KING, "Your few friends deserve the best protection. Each time you rescue or take a hit to protect a Survivor, gain 25 % stackable bonus to all Bloodpoint gains up to a maximum of 50/75/100 %. The bonus Bloodpoints are only awarded post-trial. \"Come on then, let's 'ave it! I don't give a shit pal.\" — David King Unique to David King until Level 30, at which point its Teachable version can then be learned and taught to the other Survivors."),
    WINDOWS_OF_OPPORTUNITY("Windows Of Opportunity", Survivors.KATE_DENSON, "Unlocks potential in one's Aura-reading ability. Auras of Pallets  and vaults are revealed to you when within a range of 20 metres. Windows Of Opportunity has a cool-down of 60/50/40 seconds when vaulting or dropping a Pallet during a Chase. \"Rise and shine, work hard, carve out your name, Take aim, pull the trigger, hit the bulls eye for fame, Know the value of faith, an' family, and don't you complain, Open wide, your windows of opportunity\" — Kate Denson's \"Windows Of Opportunity\" Unique to Kate Denson until Level 35, at which point its Teachable version can then be learned and taught to the other Survivors.");

    @Nonnull
    public final String NAME;

    @Nonnull
    public final Survivors SURVIVOR;

    @Nonnull
    public final String DESCRIPTION;

    @Nonnull
    public String imageUrl;

    @Nonnull
    public Tiers tier;

    public double rating;

    public long ratings;

    SurvivorPerks(@Nonnull String name, @Nonnull Survivors survivor, @Nonnull String description) {
        NAME = name;
        SURVIVOR = survivor;
        DESCRIPTION = description;
    }

    @Nonnull
    public String getName() {
        return NAME;
    }

    @Nonnull
    public Survivors getSurvivor() {
        return SURVIVOR;
    }

    @Nonnull
    public String getDescription() {
        return DESCRIPTION;
    }

}
